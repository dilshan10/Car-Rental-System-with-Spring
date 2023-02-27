package lk.chathuranga.spring.repo;

import lk.chathuranga.spring.entity.RentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentDetailsRepo extends JpaRepository<RentDetails,String> {
}
