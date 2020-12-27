package turing.manage.login;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;
import java.util.UUID;

import turing.dao.Dao;
import turing.dao.DaoImpl;

/**
 * @desc  登录模块的M层的实现类
 * @author HYZ
 * @time  2020年12月20日
 */
public class LoginServiceImpl implements ILoginService {
	Dao dao = new DaoImpl();
	@Override
	public Map<String, Object> queryUserByNameAndPass(String name, String pass) throws ClassNotFoundException, SQLException {
		String sql = " select * from user where user_name=? and user_pass=? ";
		//指出?的类型
		int [] types = new int[2];
		types[0]=Types.VARCHAR;
		types[1]=Types.VARCHAR;
		//指出?的具体值
		Object [] values=new Object[2];
		values[0]=name;
		values[1]=pass;
		return dao.executeQueryForMap(sql, types, values);
	}
	@Override
	public void registerAdd(String name, String passone) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String sql = " insert into user values(?,?,?) ";
		
		int [] types = new int [3];
		types[0]=Types.VARCHAR;
		types[1]=Types.VARCHAR;
		types[2]=Types.VARCHAR;
		 
		Object [] values = new Object[3];
		values[0]=UUID.randomUUID().toString();
		values[1]=name;
		values[2]=passone;
		dao.executeUpdate(sql, types, values);
	}
	@Override
	public Map<String, Object> queryManagerByNameAndPass(String manager_name, String manager_pass) throws ClassNotFoundException, SQLException {
		String sql = " select * from manager where manager_name=? and manager_pass=? ";
		//指出?的类型
		int [] types = new int[2];
		types[0]=Types.VARCHAR;
		types[1]=Types.VARCHAR;
		//指出?的具体值
		Object [] values=new Object[2];
		values[0]=manager_name;
		values[1]=manager_pass;
		return dao.executeQueryForMap(sql, types, values);
	}

}
