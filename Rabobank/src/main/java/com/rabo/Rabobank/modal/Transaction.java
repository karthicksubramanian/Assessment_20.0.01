/**
 * 
 */
package com.rabo.Rabobank.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author karthik
 *
 */
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionReference;
	private String accountNumber;
	private String description;
	private float startBalance;
	private float mutation;
	private float endBalance;

	public int getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(int transactionReference) {
		this.transactionReference = transactionReference;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(float startBalance) {
		this.startBalance = startBalance;
	}

	public float getMutation() {
		return mutation;
	}

	public void setMutation(float mutation) {
		this.mutation = mutation;
	}

	public float getEndBalance() {
		return endBalance;
	}

	public void setEndBalance(float endBalance) {
		this.endBalance = endBalance;
	}

}
