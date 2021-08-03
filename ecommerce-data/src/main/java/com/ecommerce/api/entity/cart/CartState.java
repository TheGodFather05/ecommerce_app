package com.ecommerce.api.entity.cart;

public enum CartState {
    STATE_1("state_1"),
    STATE_2("state_2");

    public final String label;

    CartState(String label) {
        this.label = label;
    }
}
