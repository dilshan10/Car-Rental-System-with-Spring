package lk.chathuranga.spring.controlles;


import lk.chathuranga.spring.dto.RentDetailstDTO;
import lk.chathuranga.spring.service.RentDetailsService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/rentDetails")
public class RentDetailsControler {

    @Autowired
    private RentDetailsService service;

    @PostMapping
    public ResponseUtil saveRentDetails(@ModelAttribute RentDetailstDTO dto){
        service.addRentDetails(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @PutMapping
    public ResponseUtil updateRentDetails(@ModelAttribute RentDetailstDTO dto){
        service.updateRentDetails(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteRentDetails(String id){
        service.deleteRentDetails(id);
        return new ResponseUtil("200","Success..!",null);
    }

    @GetMapping
    public ResponseUtil getAllRentDetails(){
        ArrayList<RentDetailstDTO> allRentDetails = service.loadAllRentDetails();
        return new ResponseUtil("200","Success..!",allRentDetails);
    }

}
