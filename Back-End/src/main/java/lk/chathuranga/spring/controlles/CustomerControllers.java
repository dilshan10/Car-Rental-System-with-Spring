package lk.chathuranga.spring.controlles;

import lk.chathuranga.spring.dto.CustomerDTO;
import lk.chathuranga.spring.service.CustomerService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerControllers {

    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseUtil saveCustomer(CustomerDTO dto){
        service.addCustomer(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(CustomerDTO dto){
        service.updateCustomer(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){
        service.deleteCustomer(id);
        return new ResponseUtil("200","Success..!",null);
    }

    @GetMapping
    public ResponseUtil getAllCustomers(){
        ArrayList<CustomerDTO> allCustomers = service.loadAllCustomer();
        return new ResponseUtil("200","Success..!",allCustomers);
    }

}
