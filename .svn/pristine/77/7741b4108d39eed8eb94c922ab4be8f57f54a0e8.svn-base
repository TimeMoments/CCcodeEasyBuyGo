package turing.manage.category;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;



/**
 * @desc  商品上传模块的C层
 * @author HYZ
 * @time  2020年12月20日
 */

@SuppressWarnings("serial")
public class CategoryServlet extends HttpServlet{
	ICategoryService CategoryService = new CategoryServiceImpl();
	HttpSession session;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println("LoginServlet-->service()");
		
		String method = request.getParameter("method");
		System.out.println(method);
		try {
			if(method.equals("querytag")){
				this.querytag(request,response);
			}
			else if(method.equals("query")){
				this.query(request, response);
			}
			else if(method.equals("download")){
				this.download(request,response);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	private void downloadOutsider(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//1.外链图片的网络资源地址
		String imgUrl="https://www.baidu.com/img/bd_logo1.png";
		//2.实例化URL类
		URL  url=new URL(imgUrl);
		//3.获取URLConnection对象
		URLConnection connection = url.openConnection();
		//4.利用urlConnection获取输入流对象
		InputStream inputStream = connection.getInputStream();
		//5.设定允许跨域访问
		response.setContentType("image/jpg"); //设置返回的文件类型   
		response.setHeader("Access-Control-Allow-Origin", "*");//设置该图片允许跨域访问
		//6.下载图片
		IOUtils.copy(inputStream, response.getOutputStream());
	}
	
	private void download(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
		String coid=request.getParameter("id");
		Map<String, Object> map=CategoryService.queryForImage(coid);
		String commodity_image = (String) map.get("commodity_image");
		System.out.println(commodity_image);
		try {
			String path = this.getServletContext().getRealPath("/") + "WEB-INF/image/";
			System.out.println(path);
			File file = new File(path+commodity_image);//将服务器上的图片路径转换为文件
			FileInputStream fileInputStream = new FileInputStream(file);//将上步的文件转变为流
			System.out.println("fileInputStream----->"+fileInputStream);
			response.setContentType("image/jpg");//设置返回的文件类型
			response.setHeader("Access-Control-Allow-Origin", "*");//设置该图片允许跨域访问
			IOUtils.copy(fileInputStream, response.getOutputStream());//利用commons-io.jar包中的方法实现根据文件输出流转换为图片
		} catch (FileNotFoundException e) {//当服务器响应异常时候的处理
			downloadOutsider(request,response);
		}
	}
	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException{
		String id=request.getParameter("id");
		//UPDATE tag SET tag_has=2 WHERE tag_id=1
		List<Map<String, Object>> list_commodity=CategoryService.query(id);
		request.setAttribute("list_commodity", list_commodity);
		request.getRequestDispatcher("/jsps/category/category.jsp").forward(request, response);
		
	}
	private void querytag(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		List<Map<String, Object>> list_tag=CategoryService.querytag();
		System.out.println(list_tag);
		request.setAttribute("tag_list", list_tag);
		request.getRequestDispatcher("/jsps/category/categories.jsp").forward(request, response);
		
	}

}
