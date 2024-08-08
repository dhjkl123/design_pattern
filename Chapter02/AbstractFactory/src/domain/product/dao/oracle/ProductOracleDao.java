package domain.product.dao.oracle;

import domain.product.Product;
import domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {

    @Override
    public void insertProduct(Product product) {
        System.out.println("ProductOracleDao insertUserInfo =" + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        // TODO Auto-generated method stub
        System.out.println("ProductOracleDao updateUserInfo =" + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        // TODO Auto-generated method stub
        System.out.println("ProductOracleDao deleteUserInfo =" + product.getProductId());
    }

}
