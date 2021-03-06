package turing.manage.commodityread;

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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
/**
 * @desc   读取数据库中的信息展示在商品展示列表
 * @author 闫佳溢
 * @time   2020-12-21
 */
public class CommodityRServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ICommodityRService commodityRService=new CommodityRImpl();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println("LoginServlet-->service()");
		String method = request.getParameter("method");
		try {
			if ("queryone".equals(method)) {
				this.queryone(request,response);
			}
			else if ("download".equals(method)) {
				this.download(request,response);
			}
			else if ("queryByImage".equals(method)) {
				this.queryByImage(request,response);
			}
			else if(method.equals("download")){
				this.download(request,response);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	

	}
	/**
	 * @desc  获取图片
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
private void queryByImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
	System.out.println("Servlet--->queryByImage()");
	//1.接值
	String commodity_id=request.getParameter("commodity_id");
	System.out.println("commodity_id:"+commodity_id);

	Map<String, Object> map_image=commodityRService.queryByImages(commodity_id);
	System.out.println(map_image);
	request.setAttribute("map_image", map_image);

	
	 request.getRequestDispatcher("/jsps/commodityR/single.jsp").forward(request,response);

	}
/**
 * @desc  外部链接下载	
 * @param request
 * @param response
 * @throws IOException
 */
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
/**
 * @desc  2.下载
 * @param request
 * @param response
 * @throws IOException
 */
@SuppressWarnings("unused")
private void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //1.接值：
		System.out.println("进入download");
		String commodity_image=request.getParameter("image");
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
/**
 * @desc  单个商品查询
 * @param request
 * @param response
 * @throws ClassNotFoundException
 * @throws SQLException
 * @throws IOException
 * @throws ServletException
 */
private void queryone(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException, ServletException {
	System.out.println("Servlet--->query()");
	//1.接值
	String commodity_id=request.getParameter("commodity_id");
	System.out.println("commodity_id:"+commodity_id);

	Map<String, Object> map_queryone=commodityRService.queryOneMap(commodity_id);
	List<Map<String, Object>> list_image=commodityRService.queryimageForid(commodity_id);
	System.out.println(map_queryone);
	request.setAttribute("map_queryone", map_queryone);
	request.setAttribute("list_image", list_image);
	//4.转向
	request.getRequestDispatcher("/jsps/commodityR/single.jsp").forward(request, response);	
}
	
}
