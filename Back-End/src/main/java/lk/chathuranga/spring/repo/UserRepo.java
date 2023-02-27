package lk.chathuranga.spring.repo;

import lk.chathuranga.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
