package lk.chathuranga.spring.controlles;

import lk.chathuranga.spring.service.CarDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarControllers {

    @Autowired
    private CarDetailsService service;



}
