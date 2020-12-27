package turing.manage.User.personalInformation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
			} catch (FileUploadException e) {
				System.out.println("文件上传异常");
				System.out.println(e.getMessage());
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
 * @throws FileUploadException 
 */
private void edit(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException, FileUploadException {
	System.out.println("PersonalServlet-->edit()");
	
	String user_id = request.getParameter("id");
	System.out.println("user_id:"+user_id);
	
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
				System.out.println("virtualPath:"+virtualPath);
				//昵称
				String personal_name=formItemList.get(0).getString("utf-8");
				System.out.println("personal_name:"+personal_name);
				//性别
				String personal_sex=formItemList.get(1).getString("utf-8");
				System.out.println("personal_sex:"+personal_sex);
				//出生日期
				String personal_date=formItemList.get(2).getString("utf-8");
				System.out.println("personal_date:"+personal_date);
				//电话
				String personal_phone=formItemList.get(3).getString("utf-8");
				System.out.println("personal_phone:"+personal_phone);
				//邮箱
				String personal_email=formItemList.get(4).getString("utf-8");
				System.out.println("personal_email:"+personal_email);
				//存入数据库
				personalService.saveEdit(user_id,personal_name,personal_sex,personal_date,personal_phone,personal_email,virtualPath);
				//重定向
				response.sendRedirect(request.getContextPath()+"/User.do?method=query&user_id="+user_id+" ");
				

			}
		}
	}
	
	
	
	
	
	
	
	
	
//	   //5.将添加页面的数据信息保存到数据库中
//	   String virtualPath=fileSaveName;
//	   System.out.println("virtualPath:"+virtualPath);
	
	
	
	
//	//接值
//	String personal_name = request.getParameter("name");
//	System.out.println("personal_name:"+personal_name);
//	String personal_sex = request.getParameter("personal_sex");
//	System.out.println("personal_sex:"+personal_sex);
//	String personal_date = request.getParameter("personal_date");
//	System.out.println("personal_date:"+personal_date);
//	String personal_phone = request.getParameter("personal_phone");
//	System.out.println("personal_phone:"+personal_phone);
//	String personal_email = request.getParameter("personal_email");
//	System.out.println("personal_email:"+personal_email);
	
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
