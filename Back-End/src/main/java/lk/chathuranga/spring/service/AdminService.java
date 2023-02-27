package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {
    public void addAdmin(AdminDTO dto);

    public void updateAdmin(AdminDTO dto);

    public void deleteAdmin(String id);

    public ArrayList<AdminDTO> loadAllAdmin();
}