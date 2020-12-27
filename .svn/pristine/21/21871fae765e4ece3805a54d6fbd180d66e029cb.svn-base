package turing.manage.category;

import java.awt.Window.Type;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
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
public class CategoryServiceImpl implements ICategoryService {
	Dao dao = new DaoImpl();

	@Override
	public List<Map<String, Object>> querytag() throws ClassNotFoundException, SQLException {
		return dao.executeQueryForList("select * from tag");
	}

	@Override
	public List<Map<String, Object>> query(String id) throws ClassNotFoundException, SQLException {
		
		return dao.executeQueryForList("SELECT * FROM commodity WHERE commodity_id IN(SELECT commodity_id FROM tag_list WHERE tag_id=?)", new int[]{Types.INTEGER}, new Object[]{id});
	}

	@Override
	public Map<String, Object> queryForImage(String coid) throws ClassNotFoundException, SQLException {
		
		return dao.executeQueryForMap("select * from image where commodity_id=? and image_state=1", new int[]{Types.VARCHAR}, new Object[]{coid});
	}

	
	
	

}