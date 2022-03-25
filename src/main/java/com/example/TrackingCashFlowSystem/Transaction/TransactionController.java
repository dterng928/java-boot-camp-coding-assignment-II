package com.example.TrackingCashFlowSystem.Transaction;

import com.example.TrackingCashFlowSystem.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transaction")
    public TransactionResponse insertTransactionAmount(@RequestBody Transaction transaction) {
        if(transactionService.saveTransaction(transaction)){
            return new TransactionResponse(ResponseStatus.SUCCESS.getStatus());
        }
        return new TransactionResponse(ResponseStatus.FAIL.getStatus());
    }
}
