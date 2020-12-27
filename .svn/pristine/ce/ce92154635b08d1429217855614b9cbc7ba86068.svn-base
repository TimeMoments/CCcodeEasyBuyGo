package turing.manage.manager.shangpinliebiao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import sun.net.www.content.text.plain;
import turing.dao.Dao;
import turing.dao.DaoImpl;

/**
 * @列表模块
 * @author 张成
 *
 */
public class LiebiaoServiceimpl  implements lLiebiaoService{
   Dao dao=new DaoImpl();
	@Override
	public List<Map<String, Object>> querycommodity( String key) throws ClassNotFoundException, SQLException {
		//return dao.executeQueryForList("select * from commodity");
		
		if (key==null) 
		{
		 key="";	
		}
		String sql=" SELECT * FROM tag LEFT JOIN tag_list ON tag.tag_list_id=tag_list.tag_list_id LEFT JOIN commodity ON tag_list.commodity_id=commodity.commodity_id where commodity_name like ? ";
		int [] types=new int [1];
		types[0]=Types.VARCHAR;
		Object []values=new Object[1];
		values[0]="%"+key.trim()+"%";
		return dao.executeQueryForList(sql, types, values);
	}
	@Override
	public Map<String, Object> querycommid(String commodity_id) throws ClassNotFoundException, SQLException {
		//return dao.executeQueryForMap(" select * from commodity where commodity_id='"+commodity_id+"' ");
		//return dao.executeQueryForMap("SELECT * FROM tag LEFT JOIN tag_list ON tag.tag_list_id=tag_list.tag_list_id LEFT JOIN commodity ON tag_list.commodity_id=commodity.commodity_id ");
		 return dao.executeQueryForMap("SELECT * FROM tag LEFT JOIN tag_list ON tag.tag_list_id=tag_list.tag_list_id LEFT JOIN commodity ON tag_list.commodity_id=commodity.commodity_id where commodity.id=?", new int[]{Types.VARCHAR}, new Object[]{commodity_id});
	}
	@Override
	public void update(String commodity_name, String commodity_degree, String commodity_remark, String commodity_time,String tag_name,String commodity_id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
          String sql="update commodity set commodity_name=?,commodity_degree=?,commodity_remark=?,commodity_time=?,tag_name=? where commodity_id=?";
          
  		int[] types = new int[5];
		types[0] = Types.VARCHAR;
		types[1] = Types.VARCHAR;
		types[2] = Types.VARCHAR;
		types[3] = Types.VARCHAR;
		types[4] = Types.VARCHAR;
		types[5] = Types.VARCHAR;
		
		
		Object[] values=new Object[5];
		values[0] = commodity_name;
		values[1] = commodity_degree;
		values[2] = commodity_remark;
		values[3] = commodity_time;
		values[4] = tag_name;
		values[5] = commodity_id;
        		  
        	 dao.executeUpdate(sql, types, values);  
	}
	@Override
	public void deleteArray(String[] delIdArray) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		for(int i=0;i<delIdArray.length;i++)
		{
			
		  String sql1="  delete from tag_list where commodity_id=?  ";
	      String sql2="  delete from commodity where commodity_id=?  ";
	      String sql3="  delete from image where commodity_id=?  ";
	      String sql4="  delete from commodity_message where commodity_id=?  ";
			
			dao.executeUpdate(sql1, new int []{Types.VARCHAR}, new Object[]{delIdArray[i]});
			dao.executeUpdate(sql3, new int []{Types.VARCHAR}, new Object[]{delIdArray[i]});
			dao.executeUpdate(sql4, new int []{Types.VARCHAR}, new Object[]{delIdArray[i]});
			dao.executeUpdate(sql2, new int []{Types.VARCHAR}, new Object[]{delIdArray[i]});
		}
		
	}
	

}
