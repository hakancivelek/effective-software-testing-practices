package com.hakancivelek.testPractices.ch06.stub;

import java.util.Objects;

public class Invoice {
    private String customer;
    private int value;

    public Invoice(int value, String customer) {
        this.value = value;
        this.customer = customer;
    }

    public Invoice() {

    }

    public Invoice(String customer, int value) {
        this.customer = customer;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return value == invoice.value &&
                customer.equals(invoice.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, value);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer='" + customer + '\'' +
                ", value=" + value +
                '}';
    }

    public String getCustomer() {
        return customer;
    }

    public int getValue() {
        return value;
    }
}
