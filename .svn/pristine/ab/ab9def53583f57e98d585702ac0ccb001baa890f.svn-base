package turing.manage.User.personalInformation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * @desc  个人信息模块的C层
 * @author HYZ
 * @time  2020年12月24日
 */
@SuppressWarnings("serial")
public class PersonalServlet extends HttpServlet{
	IPersonalService personalService = new PersonalServiceImpl();
	HttpSession session;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PersonalServlet-->service()");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
			try {
				if ("query".equals(method)) {
					this.query(request,response);
				}else if ("edit".equals(method)) {
					this.edit(request,response);
				}
			} catch (ClassNotFoundException e) {
				System.out.println("类没有找到异常");
			} catch (SQLException e) {
				System.out.println("sql语句出现异常，请检查sql语句！");
			}
		
	}

/**
 * @desc  修改数据信息
 * @param request
 * @param response
 * @throws IOException 
 * @throws SQLException 
 * @throws FileNotFoundException 
 * @throws ClassNotFoundException 
 */
private void edit(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
	System.out.println("PersonalServlet-->edit()");
	String user_id = request.getParameter("id");
	System.out.println("user_id:"+user_id);
	//接值
	String personal_name = request.getParameter("name");
	System.out.println("personal_name:"+personal_name);
	String personal_sex = request.getParameter("personal_sex");
	System.out.println("personal_sex:"+personal_sex);
	String personal_date = request.getParameter("personal_date");
	System.out.println("personal_date:"+personal_date);
	String personal_phone = request.getParameter("personal_phone");
	System.out.println("personal_phone:"+personal_phone);
	String personal_email = request.getParameter("personal_email");
	System.out.println("personal_email:"+personal_email);
	//存入数据库
	personalService.saveEdit(user_id,personal_name,personal_sex,personal_date,personal_phone,personal_email);
	//重定向
	response.sendRedirect(request.getContextPath()+"/User.do?method=query&user_id="+user_id+" ");
}
/**
 * @desc  搜索个人信息
 * @param request
 * @param response
 * @throws IOException 
 * @throws SQLException 
 * @throws ClassNotFoundException 
 */
private void query(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
	System.out.println("PersonalServlet-->query()");
	String user_id = request.getParameter("user_id");
	System.out.println("user_id:"+user_id);
	//查询数据库个人信息
	Map<String, Object> map_personal = personalService.queryPersonal(user_id);
	System.out.println("map_personal:"+map_personal);
	//存值
	session = request.getSession();
	session.setAttribute("map_personal", map_personal);
//	request.setAttribute("map_personal", map_personal);
	//重定向
	response.sendRedirect(request.getContextPath()+"/jsps/User/information.jsp");
}
	
}
