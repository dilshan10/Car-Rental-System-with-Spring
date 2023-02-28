package lk.chathuranga.spring.controlles;

import lk.chathuranga.spring.dto.CarDetailsDTO;
import lk.chathuranga.spring.service.CarDetailsService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarControllers {

    @Autowired
    private CarDetailsService service;

    @PostMapping
    public ResponseUtil saveCarDetails(@ModelAttribute CarDetailsDTO dto){
        service.addCarDetails(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @PutMapping
    public ResponseUtil updateCarDetails(@ModelAttribute CarDetailsDTO dto){
        service.updateCarDetails(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCarDetails(String id){
        service.deleteCarDetails(id);
        return new ResponseUtil("200",id+" Deleted..!",null);
    }

    @GetMapping
    public ResponseUtil getAllCarDetails(){
        ArrayList<CarDetailsDTO> allCardetails = service.loadAllCarDetails();
        return new ResponseUtil("200","Success",allCardetails);
    }
}
