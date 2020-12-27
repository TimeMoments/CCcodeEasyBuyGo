package turing.manage.manager.pinglun;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import turing.dao.Dao;
import turing.dao.DaoImpl;

public class PingLunServiceimpl implements lPingLunService {

	Dao dao=new DaoImpl();

	@Override
	public List<Map<String, Object>> querymessage() throws ClassNotFoundException, SQLException {
		return dao.executeQueryForList("SELECT * FROM commodity_message LEFT JOIN commodity ON commodity_message.commodity_id=commodity.commodity_id");
	}

	@Override
	public void deleteArray(String[] delIdArray) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		
		for(int i=0;i<delIdArray.length;i++)
		{
			
		  String sql1="  delete from commodity_message where commodity_message_id=?  ";
	      
			dao.executeUpdate(sql1, new int []{Types.VARCHAR}, new Object[]{delIdArray[i]});
		}
			
	}

	@Override
	public Map<String, Object> queryid(String commodity_message_id) throws ClassNotFoundException, SQLException {
		return dao.executeQueryForMap(" select *from commodity_message where commodity_message_id=?", new int[]{Types.VARCHAR}, new Object[]{commodity_message_id});
	}

	@Override
	public void update(String commodity_message_text,String commodity_message_id ) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		  String sql="update commodity_message set commodity_message_text=? where commodity_message_id=?";
			int[] types = new int[2];
			types[0] = Types.VARCHAR;
			types[1] = Types.VARCHAR;
			Object[] values=new Object[2];
			values[0] = commodity_message_text;
			values[1] = commodity_message_id;
			
			dao.executeUpdate(sql, types, values);
			
		
	}
	
}
