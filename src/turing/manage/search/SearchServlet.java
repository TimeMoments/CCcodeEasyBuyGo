package turing.manage.search;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SearchServlet extends HttpServlet{

	ISearchService searchService = new SearchServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SearchServlet->service()");
		String method=request.getParameter("method");
		try {
			if ("search".equals(method)) {
				this.search(request,response);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}	

	}
	
	private void search(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException {
		//接收搜索传来的词
		String key=request.getParameter("key");
		List<Map<String, Object>> list_search=searchService.search(key);
		request.setAttribute("list_search", list_search);
		
		//转向到商品展示页面(多个商品)
		request.getRequestDispatcher("").forward(request, response);
	}

}
