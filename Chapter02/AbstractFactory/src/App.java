import java.io.FileInputStream;
import java.util.Properties;

import domain.product.Product;
import domain.product.dao.ProductDao;
import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;
import factory.DaoFactory;
import factory.MySqlDaoFactory;
import factory.OracleDaoFactory;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("./src/db.properties");

        Properties properties = new Properties();
        properties.load(fis);

        String dbType = properties.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("asdf");
        userInfo.setPassword("1234");
        userInfo.setUserName("jane");

        Product product = new Product();
        product.setProductId("1234");
        product.setProductName("TV");


        DaoFactory daoFactory = null;

        // 업캐스팅을 이용함
        if(dbType.equals("MYSQL")){
            daoFactory = new MySqlDaoFactory();
        }else if(dbType.equals("ORACLE")){
            daoFactory = new OracleDaoFactory();
        }else{
            System.out.println("error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        System.out.println("=== UserInfo Transaction ===");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

        ProductDao productDao = daoFactory.createProductDao();
        System.out.println("=== ProductDao Transaction ===");
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);

    }
}
