package pl.toxcustom.cafeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.toxcustom.cafeManagementSystem.POJO.Bill;

public interface BillDao extends JpaRepository<Bill, Integer> {



}
