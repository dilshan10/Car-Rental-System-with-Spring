package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {
    public void addAdmin(AdminDTO dto);

    public void upDateAdmin(AdminDTO dto);

    public void deleteAdmin(AdminDTO dto);

    public ArrayList<AdminDTO> loadAllAdmin();
}