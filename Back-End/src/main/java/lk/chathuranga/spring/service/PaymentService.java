package lk.chathuranga.spring.service;

import lk.chathuranga.spring.dto.PaymentDTO;

import java.util.ArrayList;

public interface PaymentService {
    public void addPayment(PaymentDTO dto);

    public void updatePayment(PaymentDTO dto);

    public void deletePayement(PaymentDTO dto);

    public ArrayList<PaymentDTO> loadAllPayment();
}
