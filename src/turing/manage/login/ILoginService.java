package turing.manage.login;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

/**
 * @desc 登录模块的M层接口
 * @author HYZ
 * @time  2020年12月20日
 */
public interface ILoginService {

	Map<String, Object> queryUserByNameAndPass(String name, String pass) throws ClassNotFoundException, SQLException;

	void registerAdd(String name, String passone) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	Map<String, Object> queryManagerByNameAndPass(String manager_name, String manager_pass) throws ClassNotFoundException, SQLException;

}
