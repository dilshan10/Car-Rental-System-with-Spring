package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.RentDTO;

import java.util.ArrayList;

public interface RentService {
    public void addRent(RentDTO dto);

    public void updateRent(RentDTO dto);

    public void deleteRent(RentDTO dto);

    public ArrayList<RentDTO>LoadAllRent();
}
