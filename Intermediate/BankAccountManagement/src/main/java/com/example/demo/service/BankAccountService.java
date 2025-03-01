package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bankentity.BankAccount;
import com.example.demo.repos.BankAccountRepository;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository repository;

    public BankAccount createAccount(Long id) {
        return repository.save(new BankAccount(id));
    }

    public void deposit(Long accountId, double amount) {
        BankAccount account = repository.findById(accountId).orElseThrow(() -> new IllegalArgumentException("Account not found"));
        account.deposit(amount);
        repository.save(account);
    }

    public void withdraw(Long accountId, double amount) {
        BankAccount account = repository.findById(accountId).orElseThrow(() -> new IllegalArgumentException("Account not found"));
        account.withdraw(amount);
        repository.save(account);
    }

    public double getBalance(Long accountId) {
        BankAccount account = repository.findById(accountId).orElseThrow(() -> new IllegalArgumentException("Account not found"));
        return account.getBalance();
    }

    public List<String> getTransactionHistory(Long accountId) {
        BankAccount account = repository.findById(accountId).orElseThrow(() -> new IllegalArgumentException("Account not found"));
        return account.getTransactionHistory();
    }
}