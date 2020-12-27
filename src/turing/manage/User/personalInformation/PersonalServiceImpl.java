package turing.manage.User.personalInformation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import turing.dao.Dao;
import turing.dao.DaoImpl;

/**
 * @desc  个人信息模块的实现类
 * @author HYZ
 * @time  2020年12月24日
 */
public class PersonalServiceImpl implements IPersonalService{
	Dao dao = new DaoImpl();
	
	@Override
	public Map<String, Object> queryPersonal(String user_id) throws ClassNotFoundException, SQLException {
		String sql = " select * from personal where user_id='"+user_id+"' ";
		return dao.executeQueryForMap(sql);
	}

	@Override
	public void saveEdit(String user_id, String personal_name, String personal_sex, String personal_date,
			String personal_phone, String personal_email) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String sql = " update personal set personal_name='"+personal_name+"',"
				+ "personal_sex='"+personal_sex+"',personal_date='"+personal_date+"'"
				+ ",personal_phone='"+personal_phone+"',personal_email='"+personal_email+"'"
				+ "  where  user_id='"+user_id+"' ";
		dao.executeUpdate(sql);
	}
	
	

}
