package turing.manage.User.personalsafety;

import java.sql.SQLException;
import java.util.Map;

/**
 * @desc  安全设置模块的接口
 * @author HYZ
 * @time  2020年12月25日
 */
public interface IPersonalSafetyService {

	Map<String, Object> queryPersonalSafety(String user_id) throws ClassNotFoundException, SQLException;

	Map<String, Object> queryUserPass(String user_id) throws ClassNotFoundException, SQLException;

	void editSafetyPass(String user_id, String user_newpass) throws ClassNotFoundException, SQLException;

}
