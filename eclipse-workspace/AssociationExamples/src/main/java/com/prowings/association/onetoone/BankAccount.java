package com.prowings.association.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private Long accountNumber;
	@Column
	private String bankName;
	@Column
	private double balance;
	
	public BankAccount() {
		super();

	}
	public BankAccount(int id, Long accountNumber, String bankName, double balance) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public BankAccount(Long accountNumber, String bankName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", accountNumber=" + accountNumber + ", bankName=" + bankName + ", balance="
				+ balance + "]";
	}
}
