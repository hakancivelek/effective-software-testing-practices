package com.hakancivelek.testPractices.ch02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    void noItems() {
        assertThat(cart.totalPrice())
                .isEqualTo(0);
    }

    @Test
    void itemsInTheCart() {
        cart.add(new CartItem("TV",1,250));
        assertThat(cart.totalPrice())
                .isEqualTo(250);
        cart.add(new CartItem("Laptop",1,500));
        assertThat(cart.totalPrice())
                .isEqualTo(750);
    }
}