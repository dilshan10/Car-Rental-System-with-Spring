package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.RentDetailstDTO;
import lk.chathuranga.spring.entity.RentDetails;
import lk.chathuranga.spring.repo.RentDetailsRepo;
import lk.chathuranga.spring.service.RentDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class RentDetailsServiceImpl implements RentDetailsService {

    @Autowired
    private RentDetailsRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void addRentDetails(RentDetailstDTO dto) {
        if (repo.existsById(dto.getReID())){
            throw new RuntimeException("RentDetails "+dto.getReID()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, RentDetails.class));
    }

    @Override
    public void updateRentDetails(RentDetailstDTO dto) {
        if (!repo.existsById(dto.getReID())){
            throw new RuntimeException("RentDetails "+dto.getReID()+" Not Available to Update..!");
        }
        repo.save(mapper.map(dto,RentDetails.class));
    }

    @Override
    public void deleteRentDetails(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("RentDetails "+id+" Not Available to Delete..!");
        }
        repo.deleteById(id);
    }

    @Override
    public ArrayList<RentDetailstDTO> loadAllRentDetails() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<RentDetailstDTO>>(){}.getType());
    }
}
