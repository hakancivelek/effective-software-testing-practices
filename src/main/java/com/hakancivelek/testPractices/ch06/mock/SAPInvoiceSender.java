package com.hakancivelek.testPractices.ch06.mock;

import com.hakancivelek.testPractices.ch06.stub.Invoice;
import com.hakancivelek.testPractices.ch06.stub.InvoiceFilter;

import java.util.List;

public class SAPInvoiceSender {
    private final SAP sap;
    private final InvoiceFilter invoiceFilter;

    public SAPInvoiceSender(SAP sap, InvoiceFilter invoiceFilter) {
        this.sap = sap;
        this.invoiceFilter = invoiceFilter;
    }

    public void sendLowValuedInvoices() {
        List<Invoice> lowValueInvoices = invoiceFilter.lowValueInvoices();
        for(Invoice invoice : lowValueInvoices){
            sap.send(invoice);
        }
    }
}
