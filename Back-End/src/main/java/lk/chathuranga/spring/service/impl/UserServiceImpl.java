package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.UserDTO;
import lk.chathuranga.spring.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(UserDTO dto) {

    }

    @Override
    public void updateUser(UserDTO dto) {

    }

    @Override
    public void deleteUser(String id) {

    }


    @Override
    public ArrayList<UserDTO> loadAllUser() {
        return null;
    }
}
