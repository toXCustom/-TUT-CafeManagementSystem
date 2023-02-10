package pl.toxcustom.cafeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.toxcustom.cafeManagementSystem.POJO.Category;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Integer> {

    List<Category> getAllCategory();

}
