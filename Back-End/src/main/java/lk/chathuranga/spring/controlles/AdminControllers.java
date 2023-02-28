package lk.chathuranga.spring.controlles;

import lk.chathuranga.spring.dto.AdminDTO;
import lk.chathuranga.spring.service.AdminService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminControllers {

    @Autowired
    private AdminService service;

    @GetMapping
    public ResponseUtil getAllAddmin(){
        ArrayList<AdminDTO> allAdmins = service.loadAllAdmin();
        return new ResponseUtil("200","Success",allAdmins);
    }
}
