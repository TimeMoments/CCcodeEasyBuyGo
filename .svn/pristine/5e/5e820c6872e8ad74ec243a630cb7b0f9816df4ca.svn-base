package turing.manage.manager.pinglun;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PingLunServelt  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	lPingLunService lPingLunService= new PingLunServiceimpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		             request.setCharacterEncoding("utf-8");
                     response.setCharacterEncoding("utf-8");
                     String method=request.getParameter("method");
                  
		
	              	  try {
	                    if ("query".equals(method))
	                    {
							this.query(request,response);
						} if ("delete".equals(method)) {
							this.delete(request, response);
						}if ("editPage".equals(method)) {
							this.editPage(request,response);
						}if ("edit".equals(method)) {
							this.edit(request, response);
						}
	              	  }catch (ClassNotFoundException e) {
	              		  System.out.println("类异常，，，");
							
						} catch (SQLException e) {
							System.out.println("sql异常。。");
						}	
						}
         //4.将修改的内容保存到页面上       
	private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException
	
	{
		   System.out.println(" PingLunServelt--->edit()");
		String commodity_message_id=request.getParameter("commodity_message_id");
	            System.out.println("commodity_message_id:"+commodity_message_id);
		String commodity_message_text=request.getParameter("commodity_message_text");
		
		lPingLunService.update(commodity_message_text,commodity_message_id);
		
		   response.sendRedirect(request.getContextPath()+"/pinglun.do?method=query");
	}

	//3.进入修改页面
	private void editPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		    System.out.println(" PingLunServelt--->editpage()");
		    String commodity_message_id=request.getParameter("commodity_message_id");
		    
		    Map<String, Object> map=lPingLunService.queryid(commodity_message_id);
		    
		    request.setAttribute("map", map);
		    
		    
		    request.getRequestDispatcher("/jsps/manager/commodity/pinglun/pinglun_edit.jsp").forward(request, response);
		    
		    
		    
		
	}


	//2.删除
	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
		  String [] delIdArray=request.getParameterValues("delIdArray");
		  
		  lPingLunService.deleteArray(delIdArray);
		  
		   response.sendRedirect(request.getContextPath()+"/pinglun.do?method=query");
		
	}



	//1.查询全部
	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException 
	{
		System.out.println("PingLunservlet--->query()");
		List<Map<String, Object>> list_message=lPingLunService.querymessage();
		
		request.setAttribute("list_message", list_message);
		
		request.getRequestDispatcher("/jsps/manager/commodity/pinglun/pinglun.jsp").forward(request, response);
		
		
	}
	
	
	

}
