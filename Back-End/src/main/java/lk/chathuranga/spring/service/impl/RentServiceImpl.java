package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.RentDTO;
import lk.chathuranga.spring.entity.Rent;
import lk.chathuranga.spring.repo.RentRepo;
import lk.chathuranga.spring.service.RentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class RentServiceImpl implements RentService {

    @Autowired
    private RentRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void addRent(RentDTO dto) {
        if (repo.existsById(dto.getReID())){
            throw new RuntimeException("Rent "+dto.getReID()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, Rent.class));
    }

    @Override
    public void updateRent(RentDTO dto) {
        if (!repo.existsById(dto.getReID())){
            throw new RuntimeException("Rent "+dto.getReID()+" Not Available to Update..!");
        }
        repo.save(mapper.map(dto,Rent.class));
    }

    @Override
    public void deleteRent(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Rent "+id+" Not Available to Delete..!");
        }
        repo.deleteById(id);
    }

    @Override
    public ArrayList<RentDTO> LoadAllRent() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<RentDTO>>(){}.getType());
    }
}
