package com.example.demo.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CreateAccount;
import com.example.demo.Model.authenticate;
import com.example.demo.Model.fundtransfer;
import com.example.demo.Repository.authenrepo;
import com.example.demo.Repository.createaccrepo;
import com.example.demo.Repository.fundrepo;

@Service
public class bankservice {
	
	@Autowired
	createaccrepo car;
	
	@Autowired
	fundrepo fr;
	
	@Autowired 
	authenrepo ar;

	
	public void createacc(int id, String name, String dob, String address,String nationality, String typeofacc) {
		CreateAccount ca=new CreateAccount(id,name,dob,address,nationality,typeofacc);
		car.save(ca);
			}


	public void fundt(int accno, String sname, String bankname, String ifsc, int raccno, String rname, String rbankname,
			String rifsc,int amount) {
		// TODO Auto-generated method stub
		fundtransfer ft=new fundtransfer(accno,sname,bankname,ifsc,raccno,rname,rbankname,rifsc,amount);
		fr.save(ft);
		
		
	}


	public List<fundtransfer> showt() {
		// TODO Auto-generated method stub
		return fr.findAll();
	}


	public void authen(String name, String email, String pwd) {
		// TODO Auto-generated method stub
		authenticate s=new authenticate(name,email,pwd);
		ar.save(s);
	}


	public boolean log(String email, String pwd) {
		
			authenticate ars1=ar.findByEmail(email);
			if (ars1 != null && ars1.getPwd().equals(pwd)) {
		        // Authentication successful (email and password match)
		        return true;
		    } else {
		        // Authentication failed (email not found or password mismatch)
		        return false;
		    }

}}
