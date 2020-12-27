package turing.manage.User.personalInformation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @desc 个人信息模块的接口
 * @author HYZ
 * @time  2020年12月24日
 */
public interface IPersonalService {

	Map<String, Object> queryPersonal(String user_id) throws ClassNotFoundException, SQLException;

	void saveEdit(String user_id, String personal_name, String personal_sex, String personal_date,
			String personal_phone, String personal_email,String virtualPath) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	
	
	
	
}
