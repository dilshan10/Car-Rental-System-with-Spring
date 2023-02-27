package lk.chathuranga.spring.repo;

import lk.chathuranga.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<Customer,String> {
}
