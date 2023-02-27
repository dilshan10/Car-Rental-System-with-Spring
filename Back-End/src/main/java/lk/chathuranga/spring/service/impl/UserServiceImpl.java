package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.UserDTO;
import lk.chathuranga.spring.entity.User;
import lk.chathuranga.spring.repo.UserRepo;
import lk.chathuranga.spring.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addUser(UserDTO dto) {
        if (repo.existsById(dto.getUID())){
            throw new RuntimeException("User "+dto.getUID()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, User.class));
    }

    @Override
    public void updateUser(UserDTO dto) {
        if (repo.existsById(dto.getUID())){
            throw new RuntimeException("User "+dto.getUID()+" Not Available to Update..!");
        }
        repo.save(mapper.map(dto, User.class));
    }

    @Override
    public void deleteUser(String id) {
        if (repo.existsById(id)){
            throw new RuntimeException("User "+id+" Not Available to Delete..!");
        }
        repo.deleteById(id);
    }


    @Override
    public ArrayList<UserDTO> loadAllUser() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<UserDTO>>(){}.getType());
    }
}
