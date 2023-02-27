package lk.chathuranga.spring.service.impl;

import lk.chathuranga.spring.dto.PaymentDTO;
import lk.chathuranga.spring.entity.Payment;
import lk.chathuranga.spring.repo.PaymentRepo;
import lk.chathuranga.spring.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void addPayment(PaymentDTO dto) {
        if (repo.existsById(dto.getPayID())){
            throw new RuntimeException("Payment "+dto.getPayID()+" Already Exist..!");
        }
        repo.save(mapper.map(dto, Payment.class));
    }

    @Override
    public void updatePayment(PaymentDTO dto) {
        if (!repo.existsById(dto.getPayID())){
            throw new RuntimeException("Payment "+dto.getPayID()+" Not Available To Update..!");
        }
        repo.save(mapper.map(dto,Payment.class));
    }

    @Override
    public void deletePayement(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Payment "+id+" Not Available to Delete..!");
        }
        repo.deleteById(id);
    }

    @Override
    public ArrayList<PaymentDTO> loadAllPayment() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<PaymentDTO>>(){}.getType());
    }
}
