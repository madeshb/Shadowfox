package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.CreateAccount;


@Repository
public interface createaccrepo extends JpaRepository <CreateAccount,Integer> {

}
