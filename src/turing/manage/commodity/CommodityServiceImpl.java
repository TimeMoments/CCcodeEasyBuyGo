package turing.manage.commodity;

import java.awt.Window.Type;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import turing.dao.Dao;
import turing.dao.DaoImpl;
import turing.dao.Dates;

/**
 * @desc  登录模块的M层的实现类
 * @author HYZ
 * @time  2020年12月20日
 */
public class CommodityServiceImpl implements ICommodityService {
	Dao dao = new DaoImpl();

	@Override
	public void addcommodity(String commdity_id,String user_id, String commodity_degree,
			String commodity_name, String commodity_price, String commodity_remark, String tag_name, String way,String commodity_sum) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		
			
			String commdity_time=Dates.CurrentYMDHSMTime();
			int commodity_way=0;
			int []types=new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
			Object[] values=new Object[]{commdity_id,commodity_name,commodity_degree,Integer.parseInt(commodity_price),commdity_time,Integer.parseInt(commodity_sum),commodity_remark,commodity_way,tag_name};
			String sql="insert into commoditypass values(?,?,?,?,?,?,?,?,?)";
			dao.executeUpdate(sql, types, values);
			
	}

	@Override
	public void saveForimage(String commodity_image, String commodity_id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String sql="insert into image values(?,?)";
		int[] types=new int[]{Types.VARCHAR,Types.VARCHAR};
		Object[] values=new Object[]{commodity_id,commodity_image};
		dao.executeUpdate(sql, types, values);
	}

	@Override
	public void addcommodity(String user_id, String commodity_id, String commodity_name, String commodity_text,
			String commodity_remark, String commodity_price, String commodity_degree, String commodity_sum,
			String commodity_way, String virtualPath) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String sql="insert into commoditypass values(?,?,?,?,?,?,?,?,?,?)";
		//String sql="insert into commoditypass(user_id,commodity_id,commodity_name,commodity_text,commodity_remark,commodity_price,commodity_degree,commodity_sum,commodity_way,commodity_image) values(user_id='"+user_id+"',commodity_id='"+commodity_id+"',commodity_name='"+commodity_name+"',commodity_text='"+commodity_text+"',commodity_remark='"+commodity_remark+"',commodity_price='"+commodity_price+"',commodity_degree='"+commodity_degree+"',commodity_num='"+commodity_sum+"',commodity_way='"+commodity_way+"',commodity_image='"+virtualPath+"')";
		//int []types=new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.INTEGER,Types.VARCHAR,Types.INTEGER,Types.VARCHAR,Types.INTEGER,Types.VARCHAR,Types.VARCHAR};
		//Object[] values=new Object[]{user_id,commodity_id,commodity_name,commodity_text,commodity_remark,commodity_price,commodity_degree,commodity_sum,commodity_way,virtualPath};
		//String sql="insert into commoditypass  values(user_id='"+user_id+"',commodity_id='"+commodity_id+"',commodity_name='"+commodity_name+"',commodity_text='"+commodity_text+"',commodity_remark='"+commodity_remark+"',commodity_price='"+commodity_price+"',commodity_degree='"+commodity_degree+"',commodity_num='"+commodity_sum+"',commodity_way='"+commodity_way+"',commodity_image='"+virtualPath+"')";

		//dao.executeUpdate(sql, types, values);	
		//dao.executeUpdate(sql);
		
		
		int [] types = new int[10];
		types[0] = Types.VARCHAR;
		types[1] = Types.VARCHAR;
		types[2] = Types.VARCHAR;
		types[3] = Types.VARCHAR;
		types[4] = Types.VARCHAR;
		types[5] = Types.VARCHAR;
		types[6] = Types.VARCHAR;
		types[7] = Types.VARCHAR;
		types[8] = Types.VARCHAR;
		types[9] = Types.VARCHAR;
		
		Object[] values = new Object[10];
		values[0] = user_id;
		values[1] = commodity_id;
		values[2] = commodity_name;
		values[3] = commodity_text;
		values[4] = commodity_remark;
		values[5] = commodity_price;
		values[6] = commodity_degree;
		values[7] = commodity_sum;
		values[8] = commodity_way;
		values[9] = virtualPath;
		
		dao.executeUpdate(sql, types, values);
		
	}

	
	

}
