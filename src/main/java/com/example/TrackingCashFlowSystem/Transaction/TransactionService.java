package com.example.TrackingCashFlowSystem.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Boolean saveTransaction(Transaction transaction) {
        try{
            transactionRepository.save(transaction);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
