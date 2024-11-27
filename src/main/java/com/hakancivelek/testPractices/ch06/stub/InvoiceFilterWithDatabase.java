package com.hakancivelek.testPractices.ch06.stub;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class InvoiceFilterWithDatabase {
    public List<Invoice> lowValueInvoices() {
        DatabaseConnection dbConnection = new DatabaseConnection();
        InvoiceService invoiceService = new InvoiceService(dbConnection);

        try {
            List<Invoice> all = invoiceService.all();
            return all.stream()
                    .filter(invoice -> invoice.getValue() < 100)
                    .collect(toList());
        } finally {
            dbConnection.close();
        }
    }
}
