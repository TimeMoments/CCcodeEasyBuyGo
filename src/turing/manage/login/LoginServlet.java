package turing.manage.login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * @desc  登录模块的C层
 * @author HYZ
 * @time  2020年12月20日
 */

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	ILoginService loginService = new LoginServiceImpl();
	HttpSession session;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println("LoginServlet-->service()");
		String method = request.getParameter("method");
		try {
			if ("login".equals(method)) {
				this.login(request,response);
			}else if ("managerlogin".equals(method)) {
				this.managerlogin(request,response);
			}else if ("logout".equals(method)) {
				this.logout(request,response);
			}else if ("register".equals(method)) {
				this.register(request,response);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("类没有找到异常...");
		} catch (SQLException e) {
			System.out.println("SQL异常...");
		}
	}

/**
 * @desc  用户注册
 * @param request
 * @param response
 * @throws IOException 
 * @throws SQLException 
 * @throws ClassNotFoundException 
 */
private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
	System.out.println("LoginServlet-->register()");
	//接值
	String name = request.getParameter("user");
	String passone = request.getParameter("passone");
	System.out.println("name:"+name);
	System.out.println("passone:"+passone);
	//添加数据
	loginService.registerAdd(name,passone);
	//重定向
	response.sendRedirect(request.getContextPath()+"/indextow.jsp");
}
/**
 * @desc  2.退出登录
 * @param request
 * @param response
 * @throws IOException 
 * @throws ServletException 
 */
private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("LoginServlet-->logout()");
	//销毁session
	session.invalidate();
	response.sendRedirect(request.getContextPath()+"/index.jsp");
	
}
/**
 * @desc 后台管理登录
 * @param request
 * @param response
 * @throws SQLException 
 * @throws ClassNotFoundException 
 * @throws IOException 
 * @throws ServletException 
 */
private void managerlogin(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException {
	System.out.println("LoginServlet-->managerlogin()");
	//1.接值
	String manager_name = request.getParameter("manager_name");
	String manager_pass = request.getParameter("manager_pass");
	System.out.println("manager_name:"+manager_name);
	System.out.println("manager_name:"+manager_pass);
	//2.调用M层查询该用户是否存在
	Map<String, Object> map = loginService.queryManagerByNameAndPass(manager_name,manager_pass);
	//3.判断登录是否成功
	if (map==null) {
		System.out.println("登录失败");
		//4.转向:转向到错误展示页面
		String errorMsg="登录失败!用户名或者密码错误...";
		request.setAttribute("error", errorMsg);
		request.getRequestDispatcher("/jsps/login/error.jsp").forward(request, response);
	}else {
		System.out.println("欢迎回来!管理员");
		//5.获取session，并将查询得到的该条数据信息存入到session中
		session = request.getSession();
		session.setAttribute("user", map);
		String sessionId = session.getId();
		System.out.println("sessionId:"+sessionId);
		//4.转向:转向管理员页面
		response.sendRedirect(request.getContextPath()+"/manager.do?method=query");
	
	}
}
/**
 * @desc 1.登录
 * @param request
 * @param response
 * @throws IOException 
 * @throws ServletException 
 * @throws SQLException 
 * @throws ClassNotFoundException 
 */
private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
	System.out.println("LoginServlet-->login()");
	//1.接值
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	System.out.println("name:"+name);
	System.out.println("pass:"+pass);
	//2.调用M层查询该用户是否存在
	Map<String, Object> map = loginService.queryUserByNameAndPass(name,pass);
	System.out.println("map:"+map);
	
	//3.判断登录是否成功
	if (map==null) {
		System.out.println("登录失败");
		//4.转向:转向到错误展示页面
		String errorMsg="登录失败!用户名或者密码错误...";
		request.setAttribute("error", errorMsg);
		request.getRequestDispatcher("/jsps/login/error.jsp").forward(request, response);
	}else {
		System.out.println("登陆成功了！");
		//5.获取session，并将查询得到的该条数据信息存入到session中
		session = request.getSession();
		session.setAttribute("user", map);
		String sessionId = session.getId();
		System.out.println("sessionId:"+sessionId);
		//4.转向:转向到首页列表页面
		response.sendRedirect(request.getContextPath()+"/indextow.jsp");
	
	}
}



}
