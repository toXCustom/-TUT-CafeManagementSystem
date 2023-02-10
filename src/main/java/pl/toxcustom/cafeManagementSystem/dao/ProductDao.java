package pl.toxcustom.cafeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import pl.toxcustom.cafeManagementSystem.POJO.Product;
import pl.toxcustom.cafeManagementSystem.wrapper.ProductWrapper;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<ProductWrapper> getAllProduct();
    List<ProductWrapper> getProductByCategory(@Param("id") Integer id);
    ProductWrapper getProductById(@Param("id") Integer id);

    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status") String status, @Param("id") Integer id);

}
