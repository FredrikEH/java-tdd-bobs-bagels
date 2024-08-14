package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    Basket basket = new Basket();

    @Test
    public void testOrderExists(){
        Assertions.assertFalse(basket.order(""));
    }

    @Test
    public void testBagelsExist(){
        Assertions.assertFalse(basket.bagels.isEmpty());
    }
}
