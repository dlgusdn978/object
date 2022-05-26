package ch13.domain.userInfo.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;
import ch13.domain.userInfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.contentEquals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else {
			System.out.println("error");
			return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
	}
	

}
