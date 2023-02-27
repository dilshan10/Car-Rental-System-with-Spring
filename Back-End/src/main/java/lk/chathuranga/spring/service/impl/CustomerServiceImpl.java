package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.CustomerDTO;
import lk.chathuranga.spring.entity.Customer;
import lk.chathuranga.spring.repo.CustomerRepo;
import lk.chathuranga.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void addCustomer(CustomerDTO dto) {
        if (repo.existsById(dto.getCustID())){
            throw new RuntimeException("Customer "+dto.getCustID()+"  Already Exist..!");
        }
        repo.save(mapper.map(dto, Customer.class));
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if (!repo.existsById(dto.getCustID())){
            throw new RuntimeException("Customer "+dto.getCustID()+" Not Available to Update..!");
        }
    }

    @Override
    public void deleteCustomer(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Customer"+id+" Not Available to Delete..!");
        }
        repo.deleteById(id);
    }

    @Override
    public ArrayList<CustomerDTO> loadAllCustomer() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<CustomerDTO>>(){}.getType());
    }
}