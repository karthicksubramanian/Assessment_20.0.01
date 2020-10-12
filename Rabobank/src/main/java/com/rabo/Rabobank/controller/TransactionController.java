/**
 * 
 */
package com.rabo.Rabobank.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabo.Rabobank.exception.CSVException;
import com.rabo.Rabobank.modal.Transaction;
import com.rabo.Rabobank.service.TransactionService;

/**
 * @author karthik
 *
 */
@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@GetMapping(value = "/json", produces = "application/json")
	public List<Transaction> getAllTransaction() {
		return transactionService.getAllTransaction();
	}

	@GetMapping(value = "/xml", produces = "application/xml")
	public List<Transaction> getAllTransactionXml() {
		return transactionService.getAllTransaction();
	}

	@GetMapping(value = "/csv", produces = "text/csv")
	public void getAllTransactionCSV(HttpServletResponse httpServletResponse) throws CSVException {
		transactionService.getAllTransactionCSV(httpServletResponse);
	}

}
