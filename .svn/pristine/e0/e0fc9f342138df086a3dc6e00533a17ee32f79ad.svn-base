package turing.manage.manager.pinglun;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface lPingLunService {

	List<Map<String, Object>> querymessage() throws ClassNotFoundException, SQLException;

	void deleteArray(String[] delIdArray) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	Map<String, Object> queryid(String commodity_message_id) throws ClassNotFoundException, SQLException;

	void update(String commodity_message_text,String commodity_message_id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

}
