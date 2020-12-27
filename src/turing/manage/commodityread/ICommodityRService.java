package turing.manage.commodityread;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ICommodityRService {

	Map<String, Object> queryOneMap(String commodity_id) throws ClassNotFoundException, SQLException;

	Map<String, Object> queryByImages(String commodity_id) throws ClassNotFoundException, SQLException;



}
