package lk.chathuranga.spring.repo;

import lk.chathuranga.spring.entity.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDetailsRepo extends JpaRepository<CarDetails,String > {
}
