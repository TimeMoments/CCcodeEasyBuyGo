package turing.manage.manager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @desc 管理员的接口
 * @author 张成
 */
public interface lManagerService {

	List<Map<String, Object>> querycommodity() throws ClassNotFoundException, SQLException;

	Map<String, Object> querycommid(String commodity_id) throws ClassNotFoundException, SQLException;

	void update(String commodity_name, String commodity_degree, String commodity_way, String commodity_time,String commodity_id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;





}
