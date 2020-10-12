/**
 * 
 */
package com.rabo.Rabobank.utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.http.HttpHeaders;

import com.rabo.Rabobank.modal.Transaction;

/**
 * @author karthik
 *
 */
public class CSVFormatterUtils {

	public static void generateCsv(HttpServletResponse response, List<Transaction> list) throws IOException {
		String filename = "records.csv";
		CSVPrinter csvPrinter = null;
		try {
			response.setContentType("text/csv");
			response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"");
			csvPrinter = new CSVPrinter(response.getWriter(),
					CSVFormat.DEFAULT.withHeader("Reference", "AccountNumber", "Description", "Start Balance", "Mutation", "End Balance"));

			for (Transaction record : list) {
				csvPrinter.printRecord(Arrays.asList(record.getTransactionReference(), record.getAccountNumber(),
						record.getDescription(), record.getStartBalance(), record.getMutation(),
						record.getEndBalance()));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (csvPrinter != null)
				csvPrinter.close();
		}

	}

}
