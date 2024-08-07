package domain.userinfo.dao.mysql;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoMysSqlDao implements UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("UserInfoMysSqlDao insertUserInfo =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        // TODO Auto-generated method stub
        System.out.println("UserInfoMysSqlDao updateUserInfo =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        // TODO Auto-generated method stub
        System.out.println("UserInfoMysSqlDao deleteUserInfo =" + userInfo.getUserId());
    }

}
