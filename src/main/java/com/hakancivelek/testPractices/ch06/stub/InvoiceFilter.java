package com.hakancivelek.testPractices.ch06.stub;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class InvoiceFilter {
    private final InvoiceService invoiceService;

    public InvoiceFilter(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public List<Invoice> lowValueInvoices() {
        List<Invoice> all = invoiceService.all();
        return all.stream()
                .filter(invoice -> invoice.getValue() < 100)
                .collect(toList());
    }
}
