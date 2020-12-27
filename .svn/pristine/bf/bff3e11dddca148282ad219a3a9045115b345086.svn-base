package turing.manage.commodity;

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
public class CommodityServlet extends HttpServlet{
	ICommodityService CommodityService = new CommodityServiceImpl();
	HttpSession session;
	String user_id;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println("LoginServlet-->service()");
		
		String method = request.getParameter("method");
		System.out.println(method);
		try {
			if(method.equals("addcommodity")){
				//this.addcommodity(request,response);
			}
			else if(method.equals("addcommodityPage")){
				this.addcommodityPage(request,response);
			}
			else if(method.equals("upload")){
				this.upload(request,response);
			}
			else if(method.equals("query")){
				this.query(request,response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		/**
	 * 查询展示下拉框数据
	 * @param request
	 * @param response
	 */
	private void query(HttpServletRequest request, HttpServletResponse response) {

	}
	/**
	 * @desc  跳转发布页面
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private void addcommodityPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		//转入添加页面
		System.out.println("——————————进入添加页面");
		
		List<Map<String, Object>> list_tag_name = CommodityService.queryTag();
		List<Map<String, Object>> list_deal_way = CommodityService.querydeal();
		
		user_id=request.getParameter("user_id");
		System.out.println("user_id:"+user_id);
		request.setAttribute("user_id", user_id);
		request.setAttribute("list_tag_name", list_tag_name);
		request.setAttribute("list_deal_way", list_deal_way);
		//session.setAttribute("user_id", user_id);
		request.getRequestDispatcher("/jsps/commodity/release.jsp").forward(request, response);
	}
	
	/**
	 * @desc  添加商品与其图片
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 * @throws FileUploadException 
	 */
/*	private void addcommodity(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException, FileUploadException {
		//用户id
		String user_id=request.getParameter("id");
		//商品id
		String commodity_id=UUID.randomUUID().toString().substring(0,9);
		//商品名
		String commodity_name=request.getParameter("commodity_name");
		//含有标签名的字符串，由后台管理员进行确认之后配置标签表
		String tag_name=request.getParameter("commodity_text");
		//商品简介
		String commodity_remark=request.getParameter("commodity_remark");
		//商品新旧
		String commodity_degree=request.getParameter("commodity_degree");
		//商品价格
		String commodity_price=request.getParameter("commodity_price");
		//商品数量
		String commodity_sum=request.getParameter("commodity_num");
		//交易方式
		String[] way=request.getParameterValues("waylist");
		
		//CommodityService.addcommodity(commodity_id,user_id,commodity_degree,commodity_name,commodity_price,commodity_remark,tag_name,way,commodity_sum);
		//图片下载调用
		System.out.println("转向");
		response.sendRedirect(request.getContextPath()+"/jsps/commodity.do?method=upload&commodity_id="+commodity_id+"");
		System.out.println("转向完毕");

	}*/

	/**
	 * 上传
	 * @param request
	 * @param response
	 * @throws FileUploadException 
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
		private void upload(HttpServletRequest request, HttpServletResponse response) throws FileUploadException, IOException, ClassNotFoundException, SQLException {
			//String user_id=request.getParameter("user_id");
			//System.out.println(user_id);
			
			
			//1.设定类型和编码
			response.setContentType("text/html;charset=utf-8");
			
			//2.生命变量
			String fileSaveName=null;//将来保存服务器硬盘上的图片的名字
			List<FileItem> formItemList;//解析的上传页面 的表单元素的集合（两个表单一个文件域）
			//3.设定图片保存在服务器上的路径
			String path=this.getServletContext().getRealPath("/")+ "WEB-INF/image";
			System.out.println("图片存储路径："+path);
			//4.根据路径名穿件一个File实例 其目的是为了创建存储的目录
			File file=new File(path);
			if (!file.exists()) { //如果没有就创建一个
				file.mkdir();
			}
			 //5将请求消息实体中的每一个项目封装成单独的DiskFileItem (FileItem接口的实现) 对象的任务
	        //直白的说就是将本次请求的request封装成DiskFileItemFactory对象 
			DiskFileItemFactory factory=new DiskFileItemFactory();
			
			 //6.使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，
			//每一个FileItem对应一个Form表单的输入项
			ServletFileUpload upload=new ServletFileUpload(factory);
			
			//7.设定中文处理
			upload.setHeaderEncoding("utf-8");
			
			//————————————————————————————————————————————————错误的地方——————————————————————————————————————————————————————————————————
			formItemList = upload.parseRequest(request);
			
			if ((formItemList!=null)&&(formItemList.size()>0)) {
				for (FileItem Item : formItemList) {
					System.out.println(Item);
					if (!Item.isFormField()) {
						
						//获取上传图片的名字
						String fileName=Item.getName();
						System.out.println("上传文件的名字"+fileName);
						
						//获取后缀
						String prifix=fileName.substring(fileName.lastIndexOf(".")+1);
						//重新设定保存在服务器硬盘上 的图片的名字 UUID+（session）
						String id=UUID.randomUUID().toString();
						fileSaveName=id+"."+prifix;
						System.out.println("保存文件的名字"+fileSaveName);
						
						//利用commons-io.jar包中的方法实现保存到硬盘上
						FileUtils.copyInputStreamToFile(Item.getInputStream(),new File(path+"/"+fileSaveName));
					
						//5.将添加页面的数据信息保存到数据库中
						String virtualPath=fileSaveName;
						//商品id
						String commodity_id=UUID.randomUUID().toString().substring(0,9);
						//商品名
						String commodity_name=formItemList.get(0).getString("utf-8");

						//commodity_text
						String commodity_text=formItemList.get(1).getString("utf-8");
						//商品备注
						String commodity_remark=formItemList.get(2).getString("utf-8");
						//商品价格
						String commodity_price=formItemList.get(3).getString("utf-8");
						//几成新
						String commodity_degree=formItemList.get(4).getString("utf-8");
						//商品数量
						String commodity_sum=formItemList.get(5).getString("utf-8");
						//交易方式
						String commodity_way=formItemList.get(6).getString("utf-8");
						CommodityService.addcommodity(user_id,commodity_id,commodity_name,commodity_text,commodity_remark,commodity_price,commodity_degree,commodity_sum,commodity_way,virtualPath);

						//6.重定向
						response.sendRedirect(request.getContextPath()+"/indextow.jsp");
						

					}
				}
			}
			
		}




}
