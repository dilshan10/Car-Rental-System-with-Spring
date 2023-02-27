package lk.chathuranga.spring.repo;

import lk.chathuranga.spring.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepo extends JpaRepository<Schedule,String> {
}
