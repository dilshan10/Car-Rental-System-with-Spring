package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.DriverDTO;

import java.util.ArrayList;

public interface DriverService {
    public void addDriver(DriverDTO dto);

    public void updateDriver(DriverDTO dto);

    public void deleteDriver(DriverDTO dto);

    public ArrayList<DriverDTO>loadAllDriver();
}
