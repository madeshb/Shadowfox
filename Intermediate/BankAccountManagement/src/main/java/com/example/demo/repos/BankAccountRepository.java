package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bankentity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
