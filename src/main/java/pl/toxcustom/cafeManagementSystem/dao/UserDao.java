package pl.toxcustom.cafeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import pl.toxcustom.cafeManagementSystem.POJO.User;

public interface UserDao extends JpaRepository<User,Integer> {

    User findByEmailId(@Param("email") String email);

}
