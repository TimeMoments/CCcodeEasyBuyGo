package turing.manage.register;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

public interface IRegisterservice {

	void registerAdd(String username, String password, String email, String ucode) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	Map<String, Object> queryCode(String ucode) throws ClassNotFoundException, SQLException;

	void updateUstate(String ucode) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	int queryManagerByName(String user_name) throws ClassNotFoundException, SQLException;

}
