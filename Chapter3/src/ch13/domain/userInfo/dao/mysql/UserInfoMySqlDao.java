package ch13.domain.userInfo.dao.mysql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySql DB userID = "+ userInfo.getUserID());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into MySql DB userID = "+ userInfo.getUserID());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("delete into MySql DB userID = "+ userInfo.getUserID());
		
	}

}
