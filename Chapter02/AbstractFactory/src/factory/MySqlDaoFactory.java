package factory;

import domain.product.dao.ProductDao;
import domain.product.dao.mysql.ProductMySqlDao;
import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.dao.mysql.UserInfoMysSqlDao;

public class MySqlDaoFactory implements DaoFactory{

    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMysSqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }

}
