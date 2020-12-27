package turing.manage.User.personalsafety;
/**
 * @desc 安全设置模块的实现类
 * @author HYZ
 * @time  2020年12月25日
 */

import java.sql.SQLException;
import java.util.Map;

import turing.dao.Dao;
import turing.dao.DaoImpl;

public class PersonalSafetyServiceImpl implements IPersonalSafetyService{
	Dao dao = new DaoImpl();

	@Override
	public Map<String, Object> queryPersonalSafety(String user_id) throws ClassNotFoundException, SQLException {
		String sql = " select * from personal where user_id='"+user_id+"' ";
		return dao.executeQueryForMap(sql);
	}

	@Override
	public Map<String, Object> queryUserPass(String user_id) throws ClassNotFoundException, SQLException {
		return dao.executeQueryForMap(" select user_pass from user where user_id='"+user_id+"' ");
	}

	@Override
	public void editSafetyPass(String user_id, String user_newpass) throws ClassNotFoundException, SQLException {
		String sql = " update user set user_pass='"+user_newpass+"' where user_id='"+user_id+"' ";
		dao.executeUpdate(sql);
	}
}
