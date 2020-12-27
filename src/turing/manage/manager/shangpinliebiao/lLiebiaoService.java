package turing.manage.manager.shangpinliebiao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @desc 管理员的接口
 * @author 张成
 */
public interface lLiebiaoService {

	List<Map<String, Object>> querycommodity(String key) throws ClassNotFoundException, SQLException;

	Map<String, Object> querycommid(String commodity_id) throws ClassNotFoundException, SQLException;

	void update(String commodity_name, String commodity_degree, String commodity_remark, String commodity_time,String tag_name,String commodity_id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException; 

	void deleteArray(String[] delIdArray) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;





}
