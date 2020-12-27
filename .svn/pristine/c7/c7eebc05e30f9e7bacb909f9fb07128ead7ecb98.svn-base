package turing.manage.manager.shangpinliebiao;

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
public class LiebiaoServlet  extends HttpServlet{
	
 lLiebiaoService iLiebiaoService=new LiebiaoServiceimpl();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{                  request.setCharacterEncoding("utf-8");
	                    response.setCharacterEncoding("utf-8");
		
		         String method = request.getParameter("method");
		         System.out.println("method:--->"+method);
		   
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
				}if ("delete".equals(method)) 
				{
					this.delete(request, response);
				}
		          } catch (ClassNotFoundException e) {
					System.out.println("类异常。。");
				} catch (SQLException e) {
					System.out.println("sql异常。。");
				}	
	}
	//4.删除
	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException 
	{
	  String [] delIdArray=request.getParameterValues("delIdArray");
	  
	  iLiebiaoService.deleteArray(delIdArray);
	  
	   response.sendRedirect(request.getContextPath()+"/shangpinliebiao.do?method=query");
	  
	  
	}

	//3.保存修改的数据到页面上
	private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
		  String commodity_name=request.getParameter("commodity_name");
		  String commodity_degree=request.getParameter("commodity_degree");
		  String commodity_remark=request.getParameter("commodity_remark");
		  String commodity_time=request.getParameter("commodity_time");
		  String commodity_id=request.getParameter("commodity_id");
		  String tag_name=request.getParameter("tag_name");
	
		  
		  iLiebiaoService.update(commodity_name,commodity_degree,commodity_remark,commodity_time,tag_name,commodity_id);
		  
		   response.sendRedirect(request.getContextPath()+"/shangpinliebiao.do?method=query");
	}
	//2.进入修改页面
    private void editPage(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException 
    {
		  String commodity_id =request.getParameter("commodity_id");
	   Map<String, Object> map=iLiebiaoService.querycommid(commodity_id);
		  HttpSession session = request.getSession();
		  session.setAttribute("map", map);
		  
		  
		  request.getRequestDispatcher("jsps/manager/commodity/shangdian/list_edit.jsp").forward(request, response);
		
		  
	}

	//1.查询全部
	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException 
	{
		 System.out.println("ManagerServlet--->query()");
		 
		 String  key=request.getParameter("key");
		 List<Map<String, Object>>list_commodity=iLiebiaoService.querycommodity(key);
		// System.out.println("list_commodity:"+list_commodity);
		 HttpSession session = request.getSession();
		 //request.setAttribute("list_commodity", list_commodity);
			session.setAttribute("list_commodity", list_commodity);
			session.setAttribute("key", key);

			
	     request.getRequestDispatcher("/jsps/manager/commodity/shangdian/commodity_list.jsp").forward(request, response);
		
	}
	
	

}
