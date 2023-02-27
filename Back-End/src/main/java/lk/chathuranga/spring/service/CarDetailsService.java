package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.CarDetailsDTO;

import java.util.ArrayList;

public interface CarDetailsService {
    public void addCarDetails(CarDetailsDTO dto);

    public void updateCarDetails(CarDetailsDTO dto);

    public void deleteCarDetails(CarDetailsDTO dto);

    public ArrayList<CarDetailsDTO> loadAllCarDetails();
}