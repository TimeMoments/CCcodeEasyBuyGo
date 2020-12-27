package turing.manage.manager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @desc 管理页面
 * @author 张成
 *
 */
public class ManagerServlet  extends HttpServlet{
	
  lManagerService lManagerService=new ManagerServiceimpl();
  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		         String method = request.getParameter("method");
		         System.out.println("method:--->"+method);
		       request.setCharacterEncoding("utf-8");
		       response.setCharacterEncoding("utf-8");
		          try {
		          if ("query".equals(method)) 
		          {
					this.query(request,response);
				}if ("editPage".equals(method)) 
				{
					this.editPage(request,response);
				}if ("edit".equals(method))
				{
					this.edit(request, response);
				}
		          } catch (ClassNotFoundException e) {
					System.out.println("类异常。。");
				} catch (SQLException e) {
					System.out.println("sql异常。。");
				}	
	}
	
	//3.保存修改的数据到页面上
	private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
		  String commodity_name=request.getParameter("commodity_name");
		  String commodity_degree=request.getParameter("commodity_degree");
		  String commodity_way=request.getParameter("commodity_way");
		  String commodity_time=request.getParameter("commodity_time");
		  String commodity_id=request.getParameter("commodity_id");
		  
		  lManagerService.update(commodity_name,commodity_degree,commodity_way,commodity_time,commodity_id);
		  
		  response.sendRedirect(request.getContextPath()+"/manager.do?");
	}
	//2.进入修改页面
    private void editPage(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException 
    {
		  String commodity_id =request.getParameter("commodity_id");
	   Map<String, Object> map=lManagerService.querycommid(commodity_id);
		  HttpSession session = request.getSession();
		  session.setAttribute("map", map);
		  
		  
		  request.getRequestDispatcher("jsps/manager/commodity/shangdian/list_edit.jsp").forward(request, response);
		
		  
	}

	//1.查询全部
	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException 
	{
		 System.out.println("ManagerServlet--->query()");
		 List<Map<String, Object>>list_commodity=lManagerService.querycommodity();
		// System.out.println("list_commodity:"+list_commodity);
		 HttpSession session = request.getSession();
		 //request.setAttribute("list_commodity", list_commodity);
			session.setAttribute("list_commodity", list_commodity);

			
	     request.getRequestDispatcher("/jsps/manager/index.jsp").forward(request, response);
		
	}
	
	

}
