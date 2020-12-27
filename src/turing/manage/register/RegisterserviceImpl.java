package turing.manage.register;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;
import java.util.UUID;

import turing.dao.Dao;
import turing.dao.DaoImpl;

public class RegisterserviceImpl implements IRegisterservice {
    Dao dao=new DaoImpl();

	
	@Override
	public void registerAdd(String username, String password, String email, String ucode) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException{
	String sql = " insert into user(user_id,user_name,user_pass,user_email,user_ustate,user_ucode)  values(?,?,?,?,?,?) ";
	
	int [] types = new int [6];
	types[0]=Types.VARCHAR;
	types[1]=Types.VARCHAR;
	types[2]=Types.VARCHAR;
	types[3]=Types.VARCHAR;
	types[4]=Types.INTEGER;
	types[5]=Types.VARCHAR;
	 
	Object [] values = new Object[6];
	values[0]=UUID.randomUUID().toString();
	values[1]=username;
	values[2]=password;
	values[3]=email;
	values[4]=1;
	values[5]=ucode;
	dao.executeUpdate(sql, types, values);
	}
	
	@Override
	public Map<String, Object> queryCode(String ucode) throws ClassNotFoundException, SQLException {
		String sql="select * from user";
		return dao.executeQueryForMap(sql);
	}

	@Override
	public void updateUstate(String ucode) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		dao.executeUpdate("  update user  set user_ustate=2 where user_ucode=? ", new int []{Types.VARCHAR}, new Object[]{ucode});
	}
	
	@Override
	public int queryManagerByName(String user_name) throws ClassNotFoundException, SQLException {
		String sql = " select count(*) from user where user_name=? ";
		return dao.executeQueryForInt(sql, new int []{Types.VARCHAR}, new Object[]{user_name});
	}
}
