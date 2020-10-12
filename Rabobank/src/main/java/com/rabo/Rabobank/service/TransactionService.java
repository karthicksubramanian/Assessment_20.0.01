/**
 * 
 */
package com.rabo.Rabobank.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabo.Rabobank.exception.CSVException;
import com.rabo.Rabobank.modal.Transaction;
import com.rabo.Rabobank.repository.TransactionRepository;
import com.rabo.Rabobank.utils.CSVFormatterUtils;

/**
 * @author karthik
 *
 */

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository transactionRepository; 

	public List<Transaction> getAllTransaction() {
		
		return transactionRepository.findAll();
	}

	public void getAllTransactionCSV(HttpServletResponse httpServletResponse) throws CSVException {
		List<Transaction> list = transactionRepository.findAll();
		try {
			CSVFormatterUtils.generateCsv(httpServletResponse, list);
		} catch (Exception e) {
			 throw new CSVException("CSV Format error");
		}
	}

}
