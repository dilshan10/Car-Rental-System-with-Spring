package lk.chathuranga.spring.repo;

import lk.chathuranga.spring.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,String> {
}
