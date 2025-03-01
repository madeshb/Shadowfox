package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.fundtransfer;

@Repository
public interface fundrepo extends JpaRepository <fundtransfer,Integer>  {

}
