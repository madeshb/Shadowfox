package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class fundtransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int accno;
    private String sname;
    private String bankname;
    private String ifsc;  // Changed to String, as IFSC is alphanumeric
    private int raccno;
    private String rname;
    private String rbankname;
    private String rifsc;
    private int amount;

    // Default constructor
    public fundtransfer() {
    }

    // Constructor to initialize all fields
    public fundtransfer(int accno, String sname, String bankname, String ifsc, int raccno, String rname,
                        String rbankname, String rifsc, int amount) {
        this.accno = accno;
        this.sname = sname;
        this.bankname = bankname;
        this.ifsc = ifsc;
        this.raccno = raccno;
        this.rname = rname;
        this.rbankname = rbankname;
        this.rifsc = rifsc;
        this.amount = amount;
    }

    // Getters and Setters
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {  // Set type to String
        this.ifsc = ifsc;
    }

    public int getRaccno() {
        return raccno;
    }

    public void setRaccno(int raccno) {
        this.raccno = raccno;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRbankname() {
        return rbankname;
    }

    public void setRbankname(String rbankname) {
        this.rbankname = rbankname;
    }

    public String getRifsc() {
        return rifsc;
    }

    public void setRifsc(String rifsc) {  // Set type to String
        this.rifsc = rifsc;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

