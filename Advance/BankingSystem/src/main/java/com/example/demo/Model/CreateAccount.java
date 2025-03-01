package com.example.demo.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class CreateAccount {
@Id
private int id;
private String name;
private String dob;
private String address; 
private String nationality;
private String typeofacc;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getTypeofacc() {
	return typeofacc;
}
public void setTypeofacc(String typeofacc) {
	this.typeofacc = typeofacc;
}
public CreateAccount(int id, String name, String dob, String address, String nationality, String typeofacc) {
	
	this.id = id;
	this.name = name;
	this.dob = dob;
	this.address = address;
	this.nationality = nationality;
	this.typeofacc = typeofacc;
}
public CreateAccount() {

	
}
public CreateAccount(int id, String name, String dob, String address, String typeofacc) {
	// TODO Auto-generated constructor stub
}


}
