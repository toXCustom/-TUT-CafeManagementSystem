package pl.toxcustom.cafeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.toxcustom.cafeManagementSystem.POJO.Product;
import pl.toxcustom.cafeManagementSystem.wrapper.ProductWrapper;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<ProductWrapper> getAllProduct();

}
