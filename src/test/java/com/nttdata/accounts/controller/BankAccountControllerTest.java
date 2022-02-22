package com.nttdata.accounts.controller;

import java.sql.Date;

import com.google.common.net.MediaType;
import com.nttdata.accounts.entity.BankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

@WebFluxTest(BankAccountController.class)
public class BankAccountControllerTest {
    @Autowired
	private  WebTestClient webClient;
	
	
	@MockBean
	BankAccountController service;

  
    BankAccount account;
    @BeforeEach
	void setUp() throws Exception {
		account=new BankAccount ("1","Ahorro","12345678","1",(float) 1000.000 ,new Date(2022-02-16),true);
	}
    @Test
    void testDeleteBankAccount() {
        Mockito.when(service.deleteBankAccount(account.getId()))
        .thenReturn(Mono.just(account));

        
       


    }
    @Test
    void testFindAccountBankId() {

    }

    @Test
    void testGetBankAccount() {

    }

    @Test
    void testGetCustomerById() {

    }

    @Test
    void testGetCustomers() {

    }

    @Test
    void testSaveBankAccount() {

    }

    @Test
    void testUpdateBankAccount() {

    }
}
