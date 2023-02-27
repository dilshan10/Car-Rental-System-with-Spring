package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.AdminDTO;
import lk.chathuranga.spring.entity.Admin;
import lk.chathuranga.spring.repo.AdminRepo;
import lk.chathuranga.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addAdmin(AdminDTO dto) {
        if (repo.existsById(dto.getADID())){
            throw new RuntimeException("Admin "+dto.getADID()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, Admin.class));
    }

    @Override
    public void updateAdmin(AdminDTO dto) {
        if (!repo.existsById(dto.getADID())){
            throw new RuntimeException("Admin"+dto.getADID()+" Not Available to Update..!");
        }
        repo.save(mapper.map(dto,Admin.class));
    }

    @Override
    public void deleteAdmin(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Admin "+id+" Not Available to Delete..!");
        }
        repo.deleteById(id);
    }

    @Override
    public ArrayList<AdminDTO> loadAllAdmin() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<AdminDTO>>(){}.getType());
    }
}
