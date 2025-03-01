package com.example.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bankentity.BankAccount;
import com.example.demo.service.BankAccountService;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankAccountController {

    @Autowired
    private BankAccountService service;

    @PostMapping("/create/{id}")
    public BankAccount createAccount(@PathVariable Long id) {
        return service.createAccount(id);
    }

    @PostMapping("/deposit/{id}")
    public void deposit(@PathVariable Long id, @RequestParam double amount) {
        service.deposit(id, amount);
    }

    @PostMapping("/withdraw/{id}")
    public void withdraw(@PathVariable Long id, @RequestParam double amount) {
        service.withdraw(id, amount);
    }

    @GetMapping("/balance/{id}")
    public double getBalance(@PathVariable Long id) {
        return service.getBalance(id);
    }

    @GetMapping("/transactions/{id}")
    public List<String> getTransactionHistory(@PathVariable Long id) {
        return service.getTransactionHistory(id);
    }
}
