package lk.chathuranga.spring.controlles;

import lk.chathuranga.spring.dto.ScheduleDTO;
import lk.chathuranga.spring.service.ScheduleService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService service;

    @PostMapping
    public ResponseUtil saveSchedule(@ModelAttribute ScheduleDTO dto){
        service.addSchedule(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @PutMapping
    public ResponseUtil updateSchedule(@ModelAttribute ScheduleDTO dto){
        service.updateSchedule(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteSchedule(String id){
        service.deleteSchedule(id);
        return new ResponseUtil("200","Success..!",null);
    }

    @GetMapping
    public ResponseUtil gelAllSchedule(){
        ArrayList<ScheduleDTO> allSchedules = service.loadAllSchedule();
        return new ResponseUtil("200","Success..!",allSchedules);
    }

}
