package com.example.demo.Jtest;

import com.example.demo.service.BankAccountService;
import com.example.demo.repository.BankAccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BankAccountServiceTest {

    @Mock
    private BankAccountRepository bankAccountRepository;  // Mocking the repository

    @InjectMocks
    private BankAccountService service;  // Injecting mocks into the service

    private Long accountId;

    @BeforeEach
    void setUp() {
        accountId = 1L;  // Example account ID
        when(bankAccountRepository.findById(accountId)).thenReturn(Optional.of(new BankAccount(accountId)));  // Mocking a repository call
    }

    @Test
    void testDeposit() {
        service.deposit(accountId, 100.0);
        assertEquals(100.0, service.getBalance(accountId));
    }

    @Test
    void testWithdraw() {
        service.deposit(accountId, 200.0);
        service.withdraw(accountId, 50.0);
        assertEquals(150.0, service.getBalance(accountId));
    }

    @Test
    void testWithdrawInsufficientBalance() {
        service.deposit(accountId, 50.0);
        assertThrows(IllegalArgumentException.class, () -> service.withdraw(accountId, 100.0));
    }

    @Test
    void testTransactionHistory() {
        service.deposit(accountId, 100.0);
        service.withdraw(accountId, 30.0);
        assertEquals(2, service.getTransactionHistory(accountId).size());
    }
}
