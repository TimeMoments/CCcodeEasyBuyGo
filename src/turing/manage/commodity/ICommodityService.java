package turing.manage.commodity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @desc 登录模块的M层接口
 * @author HYZ
 * @time  2020年12月20日
 */
public interface ICommodityService {

	
	void addcommodity(String commdity_id, String user_id, String commodity_degree,  String commodity_name, String commodity_price, String commodity_remark,
			String tag_name, String way, String commodity_sum) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	void saveForimage(String commodity_image, String commodity_id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	void addcommodity(String user_id, String commodity_id, String commodity_name, String commodity_text,
			String commodity_remark, String commodity_price, String commodity_degree, String commodity_sum,
			String commodity_way, String virtualPath) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	List<Map<String, Object>> queryTag() throws ClassNotFoundException, SQLException;
	List<Map<String, Object>> querydeal() throws ClassNotFoundException, SQLException;

	

	
}
