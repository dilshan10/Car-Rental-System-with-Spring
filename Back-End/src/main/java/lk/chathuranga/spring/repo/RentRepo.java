package lk.chathuranga.spring.repo;

import lk.chathuranga.spring.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepo extends JpaRepository<Rent,String> {
}
