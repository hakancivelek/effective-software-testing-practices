package com.hakancivelek.testPractices.ch02;

public class CartItem {
    private final String product;
    private final int quantity;
    private final double unitPrice;

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public CartItem(String product, int quantity,
                    double unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
}