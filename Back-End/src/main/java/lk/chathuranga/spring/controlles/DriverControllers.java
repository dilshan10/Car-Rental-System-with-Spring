package lk.chathuranga.spring.controlles;

import lk.chathuranga.spring.dto.DriverDTO;
import lk.chathuranga.spring.service.DriverService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/driver")
public class DriverControllers {

    @Autowired
    private DriverService service;

    @PostMapping
    public ResponseUtil saveDriver(@ModelAttribute DriverDTO dto){
        service.addDriver(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @PutMapping
    public ResponseUtil updateDriver(@ModelAttribute DriverDTO dto){
        service.updateDriver(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "is")
    public ResponseUtil deleteDriver(String id){
        service.deleteDriver(id);
        return new ResponseUtil("200","Success..!",null);
    }

    @GetMapping
    public ResponseUtil getAllDrivers(){
        ArrayList<DriverDTO> allDrivers = service.loadAllDriver();
        return new ResponseUtil("200","Success..!",allDrivers);
    }

}
