package lk.chathuranga.spring.controlles;


import lk.chathuranga.spring.dto.RentDTO;
import lk.chathuranga.spring.service.RentService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/rent")
public class RentController {

    @Autowired
    private RentService service;

    @PostMapping
    public ResponseUtil saveRent(@ModelAttribute RentDTO dto){
        service.addRent(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @PutMapping
    public ResponseUtil updateRent(@ModelAttribute RentDTO dto){
        service.updateRent(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteRenty(String id){
        service.deleteRent(id);
        return new ResponseUtil("200","Success..!",null);
    }

    @GetMapping
    public ResponseUtil getAllRent(){
        ArrayList<RentDTO> allRents = service.LoadAllRent();
        return new ResponseUtil("200","Success..!",allRents);

    }


}
