package turing.manage.commodityread;

import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import turing.dao.Dao;
import turing.dao.DaoImpl;

public class CommodityRImpl implements ICommodityRService{

	Dao dao=new DaoImpl();

	@Override
	public Map<String, Object> queryOneMap(String commodity_id) throws ClassNotFoundException, SQLException {
		String sql="select * from commodity where commodity_id = ?";
		return dao.executeQueryForMap(sql,new int[]{Types.VARCHAR},new Object[]{commodity_id});

	}

	@Override
	public Map<String, Object> queryByImages(String commodity_id) throws ClassNotFoundException, SQLException {
		String sql="select * from image where commodity_id = ?";
		return dao.executeQueryForMap(sql,new int[]{Types.VARCHAR},new Object[]{commodity_id});
	}


}
