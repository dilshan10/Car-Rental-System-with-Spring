package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.CarDetailsDTO;
import lk.chathuranga.spring.entity.CarDetails;
import lk.chathuranga.spring.repo.CarDetailsRepo;
import lk.chathuranga.spring.service.CarDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class CarDetailsServiceImpl implements CarDetailsService {
    @Autowired
    private CarDetailsRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addCarDetails(CarDetailsDTO dto) {
        if (repo.existsById(dto.getRegNumber())){
            throw new RuntimeException("Car "+dto.getRegNumber()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, CarDetails.class));
    }

    @Override
    public void updateCarDetails(CarDetailsDTO dto) {
        if (!repo.existsById(dto.getRegNumber())){
            throw new RuntimeException("Car "+dto.getRegNumber()+" Not Available to Update..!");
        }
    }

    @Override
    public void deleteCarDetails(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Car "+id+" not Available to Delete..!");
        }
        repo.deleteById(id);
    }

    @Override
    public ArrayList<CarDetailsDTO> loadAllCarDetails() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<CarDetailsDTO>>(){}.getType());
    }
}
