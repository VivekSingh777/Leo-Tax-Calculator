package com.example.LeoTaxCalcultor.TaxCalucalation;

import com.example.LeoTaxCalcultor.Store.ShoppingCartItem;

public class ImportDutyTax extends Tax{
    private static final double tax = 5;
    @Override
    public boolean isTaxApplicable(ShoppingCartItem cartItem) {
        return cartItem.isImported();
    }

    @Override
    public double getRate() {
        return tax;
    }
}
