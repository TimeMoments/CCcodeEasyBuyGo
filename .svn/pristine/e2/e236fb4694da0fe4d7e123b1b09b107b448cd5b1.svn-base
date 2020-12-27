package turing.manage.manager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;


import turing.dao.Dao;
import turing.dao.DaoImpl;

/**
 * @管理员模块的
 * @author 张成
 *
 */
public class ManagerServiceimpl  implements lManagerService{
   Dao dao=new DaoImpl();
	@Override
	public List<Map<String, Object>> querycommodity() throws ClassNotFoundException, SQLException {
		return dao.executeQueryForList("select * from commodity");
	}
	@Override
	public Map<String, Object> querycommid(String commodity_id) throws ClassNotFoundException, SQLException {
		return dao.executeQueryForMap(" select * from commodity where commodity_id='"+commodity_id+"' ");
	}
	@Override
	public void update(String commodity_name, String commodity_degree, String commodity_way, String commodity_time,String commodity_id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
          String sql="update commodity set commodity_name=?,commodity_degree=?,commodity_way=?,commodity_time=?, where commodity_id=?";
          
  		int[] types = new int[5];
		types[0] = Types.VARCHAR;
		types[1] = Types.VARCHAR;
		types[2] = Types.VARCHAR;
		types[3] = Types.VARCHAR;
		types[4] = Types.VARCHAR;
		
		
		Object[] values=new Object[5];
		values[0] = commodity_name;
		values[1] = commodity_degree;
		values[2] = commodity_way;
		values[3] = commodity_time;
		values[4] = commodity_id;
        		  
        	 dao.executeUpdate(sql, types, values);  
	}
	

}
