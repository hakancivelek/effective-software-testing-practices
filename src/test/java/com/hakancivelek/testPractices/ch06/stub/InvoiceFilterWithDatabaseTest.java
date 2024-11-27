package com.hakancivelek.testPractices.ch06.stub;

import com.hakancivelek.testPractices.ch06.stub.DatabaseConnection;
import com.hakancivelek.testPractices.ch06.stub.Invoice;
import com.hakancivelek.testPractices.ch06.stub.InvoiceFilterWithDatabase;
import com.hakancivelek.testPractices.ch06.stub.InvoiceService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class InvoiceFilterWithDatabaseTest {
    private DatabaseConnection databaseConnection;
    private InvoiceService invoiceService;

    @BeforeEach
    public void open() {
        databaseConnection = new DatabaseConnection();
        invoiceService = new InvoiceService(databaseConnection);
    }

    @AfterEach
    void close() {
        if (databaseConnection != null)
            databaseConnection.close();
    }

    @Test
    void testGetAllLowValueInvoices() {
        Invoice akin = new Invoice("Akin", 10);
        Invoice hakan = new Invoice("Hakan", 54);
        Invoice richMan = new Invoice("richMan", 100);

        invoiceService.save(akin);
        invoiceService.save(hakan);
        invoiceService.save(richMan);

        InvoiceFilterWithDatabase filter = new InvoiceFilterWithDatabase();

        List<Invoice> invoices =  filter.lowValueInvoices();
        assertThat(filter.lowValueInvoices())
                .containsExactlyInAnyOrder(hakan, akin);
    }
}
