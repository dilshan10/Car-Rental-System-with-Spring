package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.AdminDTO;
import lk.chathuranga.spring.repo.AdminRepo;
import lk.chathuranga.spring.service.AdminService;
import org.modelmapper.ModelMapper;
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

    }

    @Override
    public void updateAdmin(AdminDTO dto) {

    }

    @Override
    public void deleteAdmin(AdminDTO dto) {

    }

    @Override
    public ArrayList<AdminDTO> loadAllAdmin() {
        return null;
    }
}
