package turing.manage.User.personalsafety;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @desc  安全设置模块的C层
 * @author HYZ
 * @time  2020年12月25日
 */
@SuppressWarnings("serial")
public class PersonalSafetyServlet extends HttpServlet{
	IPersonalSafetyService personalSafetyServlet = new PersonalSafetyServiceImpl();
	HttpSession session;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PersonalSafetyServlet-->service()");
		
		String method = request.getParameter("method");
		try {
			if ("querySafety".equals(method)) {
				this.querySafety(request,response);
			}else if ("editSafetyPasswordPage".equals(method)) {
				this.editSafetyPasswordPage(request,response);
			}else if ("editSafetyPassword".equals(method)) {
				this.editSafetyPassword(request,response);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("类没有找到异常");
		} catch (SQLException e) {
			System.out.println("sql语句出现异常，请检查sql语句！");
		}
	
	}


/**
 * @desc  修改登录密码
 * @param request
 * @param response
 * @throws ClassNotFoundException
 * @throws SQLException
 * @throws ServletException
 * @throws IOException
 */
private void editSafetyPassword(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException {
	System.out.println("PersonalSafetyServlet-->editSafetyPassword()");
	//接值
	String user_id = request.getParameter("user_id");
	System.out.println("user_id:"+user_id);
	String user_pass = request.getParameter("originalPassword");
	System.out.println("原密码:"+user_pass);
	Map<String, Object> map = personalSafetyServlet.queryUserPass(user_id);
	String sql_user_id = (String) map.get("user_pass");
	System.out.println("数据库存储的密码:"+sql_user_id);
	String user_newpass = request.getParameter("newPassword");
	System.out.println("新密码:"+user_newpass);
	String confirm_new_password = request.getParameter("confirm_new_password");
	System.out.println("确认新密码:"+confirm_new_password);
	String new_pass;
	if (user_pass.equals(sql_user_id)) {
		
		personalSafetyServlet.editSafetyPass(user_id,user_newpass);
	   	//转向
	   	response.sendRedirect(request.getContextPath()+"/jsps/User/personal/safety/safety.jsp");
	   
	}else {
		System.out.println("你输入的原密码或确认密码错误！");
		//4.转向:转向到错误展示页面
		String errorMsg="错误输入!原密码或者确认密码错误...";
		request.setAttribute("error", errorMsg);
		request.getRequestDispatcher("/jsps/login/error.jsp").forward(request, response);
	}
	
}
/**
 * @desc  进入密码修改页面
 * @param request
 * @param response
 * @throws IOException 
 * @throws ServletException 
 */
private void editSafetyPasswordPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("PersonalSafetyServlet-->editSafetyPasswordPage()");
	request.getRequestDispatcher("/jsps/User/personal/safety/editpasswordpage.jsp").forward(request, response);
}
/**
 * @desc  查询安全页面的信息
 * @param request
 * @param response
 * @throws SQLException 
 * @throws ClassNotFoundException 
 * @throws IOException 
 * @throws ServletException 
 */
private void querySafety(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException, ServletException {
	System.out.println("PersonalSafetyServlet-->querySafety");
	String user_id = request.getParameter("user_id");
	System.out.println("user_id:"+user_id);
	//查询数据库个人信息
	Map<String, Object> map_personal = personalSafetyServlet.queryPersonalSafety(user_id);
	System.out.println("map_personal:"+map_personal);
	//存值
	session = request.getSession();
	session.setAttribute("map_personal", map_personal);
//	request.setAttribute("map_personal", map_personal);
	//转向
	request.getRequestDispatcher("/jsps/User/safety.jsp").forward(request, response);
}

}
