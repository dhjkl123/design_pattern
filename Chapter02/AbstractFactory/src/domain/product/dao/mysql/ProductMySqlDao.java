package domain.product.dao.mysql;

import domain.product.Product;
import domain.product.dao.ProductDao;


public class ProductMySqlDao implements ProductDao{

    @Override
    public void insertProduct(Product product) {
        System.out.println("ProductMySqlDao insertUserInfo =" + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("ProductMySqlDao updateUserInfo =" + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("ProductMySqlDao deleteUserInfo =" + product.getProductId());
    }
    

}
