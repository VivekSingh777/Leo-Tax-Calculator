package com.example.LeoTaxCalcultor.Store;

import com.example.LeoTaxCalcultor.Receipt.Receipt;
import com.example.LeoTaxCalcultor.TaxCalucalation.TaxCalculation;

public class Checkout {

    private ShoppingCart shoppingCart;
    private TaxCalculation taxCalculation = new TaxCalculation();
    private Receipt receipt= new Receipt();

    public Checkout(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void checkoutCart(){
        taxCalculation.calculate(this.shoppingCart);
        receipt.print(this.shoppingCart);
    }




}
