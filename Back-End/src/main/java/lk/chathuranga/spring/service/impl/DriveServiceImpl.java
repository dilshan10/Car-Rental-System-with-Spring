package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.DriverDTO;
import lk.chathuranga.spring.entity.Driver;
import lk.chathuranga.spring.repo.DriverRepo;
import lk.chathuranga.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class DriveServiceImpl implements DriverService {

    @Autowired
    private DriverRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void addDriver(DriverDTO dto) {
        if (repo.existsById(dto.getDriID())){
            throw new RuntimeException("Driver "+dto.getDriID()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, Driver.class));
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if (!repo.existsById(dto.getDriID())){
            throw new RuntimeException("Driver "+dto.getDriID()+" Not Available to Update..!");
        }
        repo.save(mapper.map(dto,Driver.class));
    }

    @Override
    public void deleteDriver(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Driver "+id+" Not Available to Delete..!");
        }
        repo.deleteById(id);
    }

    @Override
    public ArrayList<DriverDTO> loadAllDriver() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<DriverDTO>>(){}.getType());
    }
}
