package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.ScheduleDTO;
import lk.chathuranga.spring.entity.Schedule;
import lk.chathuranga.spring.repo.ScheduleRepo;
import lk.chathuranga.spring.service.ScheduleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addSchedule(ScheduleDTO dto) {
        if (repo.existsById(dto.getSID())){
            throw new RuntimeException("Schedule "+dto.getSID()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, Schedule.class));
    }

    @Override
    public void updateSchedule(ScheduleDTO dto) {
        if (!repo.existsById(dto.getSID())){
            throw new RuntimeException("Schedule "+dto.getSID()+" Not Available to Update..!");
        }
        repo.save(mapper.map(dto, Schedule.class));
    }

    @Override
    public void deleteSchedule(String id) {
        if (! repo.existsById(id)){
            throw new RuntimeException("Schedule"+id+" Not Available to Update..!");
        }
        repo.deleteById(id);
    }

    @Override
    public ArrayList<ScheduleDTO> loadAllSchedule() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<ScheduleDTO>>(){}.getType());
    }
}
