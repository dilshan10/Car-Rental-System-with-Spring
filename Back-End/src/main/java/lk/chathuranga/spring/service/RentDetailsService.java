package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.RentDetailstDTO;

import java.util.ArrayList;

public interface RentDetailsService {
    public void addRentDetails(RentDetailstDTO dto);

    public void updateRentDetails(RentDetailstDTO dto);

    public void deleteRentDetails(RentDetailstDTO dto);

    public ArrayList<RentDetailstDTO>loadAllRentDetails();
}
