package lk.chathuranga.spring.controlles;


import lk.chathuranga.spring.dto.PaymentDTO;
import lk.chathuranga.spring.service.PaymentService;
import lk.chathuranga.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PaymentControllers  {

    @Autowired
    private PaymentService service;

    @PostMapping
    public ResponseUtil savePayment(@ModelAttribute PaymentDTO dto){
        service.addPayment(dto);
        return new ResponseUtil("200","Success..!",null);
    }
    @PutMapping
    public ResponseUtil updatePaymnt(@ModelAttribute PaymentDTO dto){
        service.updatePayment(dto);
        return new ResponseUtil("200","Success..!",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deletePayment(String id){
        service.deletePayement(id);
        return new ResponseUtil("200","Success..!",null);
    }

    @GetMapping
    public ResponseUtil loadAllPayment(){
        ArrayList<PaymentDTO> allPayments = service.loadAllPayment();
        return new ResponseUtil("200","Success",allPayments);
    }

}
