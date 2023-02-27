package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    public void addUser(UserDTO dto);

    public void updateUser(UserDTO dto);

    public void deleteUser(String id);

    public ArrayList<UserDTO> loadAllUser();
}
