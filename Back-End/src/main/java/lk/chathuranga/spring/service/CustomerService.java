package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {

    public void addCustomer(CustomerDTO dto);

    public void updateCustomer(CustomerDTO dto);

    public void deleteCustomer(CustomerDTO dto);

    public ArrayList<CustomerDTO> loadAllCustomer();
}
