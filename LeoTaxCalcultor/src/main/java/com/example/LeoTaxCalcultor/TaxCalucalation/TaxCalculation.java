package com.example.LeoTaxCalcultor.TaxCalucalation;

import com.example.LeoTaxCalcultor.Store.ShoppingCart;
import com.example.LeoTaxCalcultor.Store.ShoppingCartItem;

public class TaxCalculation {
    private BasicTax basicTax = new BasicTax();
    private ImportDutyTax importDutyTax = new ImportDutyTax();
    public void calculate(ShoppingCart shoppingCart) {
        if(shoppingCart.getCartSize()<=0) return;
        for(ShoppingCartItem item: shoppingCart.getItemsFromCart()){
            float tax = 0;
            tax += basicTax.calculate(item);
            tax += importDutyTax.calculate(item);
            item.setTotalTax(tax);
        }
    }
}
