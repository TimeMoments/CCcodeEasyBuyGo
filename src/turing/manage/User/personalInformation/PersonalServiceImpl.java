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
	public void saveEdit(String personal_id,String user_id, String personal_name, String personal_sex, String personal_date,
			String personal_phone, String personal_email,String virtualPath) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		
		String sql="update  personal  set  personal_id='"+personal_id+"'"
				+ ",personal_name='"+personal_name+"',personal_sex='"+personal_sex+"' "
				+ ",personal_date='"+personal_date+"',personal_phone='"+personal_phone+"'"
				+ ",personal_email='"+personal_email+"',personal_image='"+virtualPath+"'"
				+ "   where user_id='"+user_id+"'";
		
//		int [] types = new int[8];
//		types[0] = Types.VARCHAR;
//		types[1] = Types.VARCHAR;
//		types[2] = Types.VARCHAR;
//		types[3] = Types.VARCHAR;
//		types[4] = Types.VARCHAR;
//		types[5] = Types.VARCHAR;
//		types[6] = Types.VARCHAR;
//		types[7] = Types.VARCHAR;
//		
//		Object[] values = new Object[8];
//		values[0] = personal_id;
//		values[1] = user_id;
//		values[2] = personal_name;
//		values[3] = personal_sex;
//		values[4] = personal_date;
//		values[5] = personal_phone;
//		values[6] = personal_email;
//		values[7] = virtualPath;

		
		dao.executeUpdate(sql);
	}
	
	

}
