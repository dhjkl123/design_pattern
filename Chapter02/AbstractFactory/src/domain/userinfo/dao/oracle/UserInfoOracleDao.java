package domain.userinfo.dao.oracle;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoOracleDao insertUserInfo =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoOracleDao updateUserInfo =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoOracleDao deleteUserInfo =" + userInfo.getUserId());
    }

}
