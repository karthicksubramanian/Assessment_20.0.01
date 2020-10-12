/**
 * 
 */
package com.rabo.Rabobank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabo.Rabobank.modal.Transaction;

/**
 * @author karthik
 *
 */
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
