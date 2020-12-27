package turing.manage.register;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import turing.utils.CodeUtils;
import turing.utils.EmailUtils;

@SuppressWarnings("serial")
public class Registerservlet extends HttpServlet {
	 IRegisterservice registerservlet=new RegisterserviceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");
		try {
			if ("register".equals(method)) {
				this.register(request,response);
			}
			else if ("userServlet".equals(method)) {
				this.userServlet(request,response);
			}else if ("queryAjax".equals(method)) {
				this.queryAjax(request,response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("异常的信息为"+e.getMessage());
			System.out.println("异常发生的内存地址"+e.getStackTrace());
			request.setAttribute("error", "SQL异常");
			
			
		} catch (MessagingException e) {
			System.out.println("邮件发送异常..."+e.getMessage());
			System.out.println("异常发生的内存地址"+e.getStackTrace());
		}
	}
	
/**
 * @desc ajax的调用
 * @param request
 * @param response
 * @throws IOException 
 * @throws SQLException 
 * @throws ClassNotFoundException 
 */
private void queryAjax(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
	System.out.println("ManagerServlet-->queryAjax()");
	//1.接值
	String user_name = request.getParameter("username");
	System.out.println("user_name:"+user_name);
	//2.调用M层中的方法实现查询
	int shuLiang = registerservlet.queryManagerByName(user_name);
	//3.把最终的结果传递到ajax的匿名函数回调中
	String data;//用来承接最终的结果的
	PrintWriter out = response.getWriter();
	if (shuLiang>=1) {
		data = "no";
		out.write(data);
	}else {
		data="yes";
		out.write(data);
	}
	out.flush();
	out.close();
}
	

	
private void userServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
	//1接值
	String  ucode=request.getParameter("ucode");
	//2调用M层进行处理
	Map<String, Object>map=registerservlet.queryCode(ucode);
    if (map==null) {
	    String errorMessage="验证码错误";
	    request.setAttribute("error", errorMessage);
	    request.getRequestDispatcher("").forward(request, response);
	}else{
		registerservlet.updateUstate(ucode);
		response.sendRedirect(request.getContextPath()+"/manage/user.do?method=query");
	}
}
	
	
/**
 * @desc  用户注册
 * @param request
 * @param response
 * @throws IOException 
 * @throws SQLException 
 * @throws ClassNotFoundException 
 * @throws MessagingException 
 */
private void register(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException, MessagingException, ServletException {
	System.out.println("Registerservlet-->register()");
	//接值
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String email=request.getParameter("email");
	String ucode=CodeUtils.createdCode();
	
	System.out.println("username:"+username);
	System.out.println("password:"+password);
	//添加数据
	registerservlet.registerAdd(username,password,email,ucode);
	//发送带有验证码的邮件注册信息
	EmailUtils.createMimeMessage(request,email, ucode);
	//发送消息
	request.setAttribute("message", "恭喜您，注册成功，我们已经发了一封带了注册信息的电子邮件，请查收，如果没有收到，可能是网络原因，过一会儿就收到了！！");
	//转向
	response.sendRedirect(request.getContextPath()+"/jsps/login/login.jsp");
	
}



}
