package com.hakancivelek.testPractices.ch06.stub;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InvoiceFilterTest {

    @Test
    void testGetAllLowValueInvoices() {
        InvoiceService invoiceService = mock(InvoiceService.class);

        Invoice akin = new Invoice("Akin", 10);
        Invoice hakan = new Invoice("Hakan", 54);
        Invoice richMan = new Invoice("richMan", 100);
        List<Invoice> invoices =  Arrays.asList(akin, hakan, richMan);

        when(invoiceService.all()).thenReturn(invoices);

        InvoiceFilter filter = new InvoiceFilter(invoiceService);

        assertThat(filter.lowValueInvoices())
                .containsExactlyInAnyOrder(hakan, akin);
    }
}
