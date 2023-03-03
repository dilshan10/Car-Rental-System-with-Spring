package lk.chathuranga.spring.controlles;

import lk.chathuranga.spring.dto.UserDTO;
import lk.chathuranga.spring.service.UserService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseUtil saveUser(@ModelAttribute UserDTO dto){
        service.addUser(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @PutMapping
    public ResponseUtil updareUser(@ModelAttribute UserDTO dto){
        service.addUser(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteUser(String id){
        service.deleteUser(id);
        return new ResponseUtil("200","Success..!",null);
    }

    @GetMapping
    public ResponseUtil getAllUsers(){
        ArrayList<UserDTO> allUsers = service.loadAllUser();
        return new ResponseUtil("200","Success User..!",allUsers);
    }

}
