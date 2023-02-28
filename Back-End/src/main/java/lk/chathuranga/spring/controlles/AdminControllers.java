package lk.chathuranga.spring.controlles;

import lk.chathuranga.spring.dto.AdminDTO;
import lk.chathuranga.spring.service.AdminService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminControllers {

    @Autowired
    private AdminService service;

    @PostMapping
    public ResponseUtil saveAdmin(@ModelAttribute AdminDTO dto){
        service.addAdmin(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @PutMapping
    public ResponseUtil updateAdmin(@ModelAttribute AdminDTO dto){
        service.updateAdmin(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteAdmin(String id){
        service.deleteAdmin(id);
        return new ResponseUtil("200",id+" Deleted..!",null);
    }

    @GetMapping
    public ResponseUtil getAllAddmins(){
        ArrayList<AdminDTO> allAdmins = service.loadAllAdmin();
        return new ResponseUtil("200","Success",allAdmins);
    }
}
