package lk.chathuranga.spring.controlles;


import lk.chathuranga.spring.service.RentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/rentDetails")
public class RentDetailsControler {

    @Autowired
    private RentDetailsService service;

}
