package com.example.demo.Controller;

import java.util.List;

import org.hibernate.type.BasicTypeRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CreateAccount;
import com.example.demo.Model.fundtransfer;
import com.example.demo.Service.bankservice;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
public class bankcontroller {
	
	@Autowired
 bankservice cs;
	
	@PostMapping("/account/authenticate")
	public String authen(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("pwd") String pwd) {
		cs.authen(name,email,pwd);
		return "account created successfully";
	}
    
	@PostMapping("/account/login")
	public String login(
			@RequestParam("email") String email,
			@RequestParam("pwd") String pwd) {
	if(	cs.log(email,pwd)) 
		return "Login successfully";
	else
		return "Wrong authentication";
	}
	
	@PostMapping("/account/create")
	public String createacc(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("dob") String dob,
			@RequestParam("address") String address,
			@RequestParam("nationality") String nationality, 
			@RequestParam("typeofacc") String typeofacc){
			cs.createacc(id,name,dob,address,nationality,typeofacc);
			return "Account created successfully your Id is "+id+"with your name "+name;
		}
	
	@PostMapping("/account/fund")
	public String fundt(@RequestParam("accno") int accno,
			@RequestParam("sname") String sname,
			@RequestParam("bankname") String bankname,
			@RequestParam("ifsc") String ifsc,
			@RequestParam("raccno") int raccno,
			@RequestParam("rname") String rname,
			@RequestParam("rbankname") String rbankname,
			@RequestParam("rifsc") String rifsc,
			@RequestParam("amount") int amount) {
		cs.fundt(accno,sname,bankname,ifsc,raccno,rname,rbankname,rifsc,amount);
		return "Fund transfered successfully";
			
		
	}
			
	
	 @GetMapping("/account/showtransfer")
	public List<fundtransfer> showt(){
		return cs.showt();
		
	}
	
	
}
