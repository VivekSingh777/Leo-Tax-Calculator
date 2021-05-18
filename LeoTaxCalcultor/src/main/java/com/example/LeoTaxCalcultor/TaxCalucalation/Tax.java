package com.example.LeoTaxCalcultor.TaxCalucalation;


import com.example.LeoTaxCalcultor.Products.Product;
import com.example.LeoTaxCalcultor.Store.ShoppingCartItem;

public abstract class Tax {
   abstract boolean isTaxApplicable(ShoppingCartItem cartItem);
   abstract double getRate();

   public double calculate(ShoppingCartItem cartItem){
       if (isTaxApplicable(cartItem)){
           double tax = (cartItem.getProduct().getPrice() * getRate())/100;
           tax =  Math.ceil(tax/0.05)*0.05;
           return tax;
       }
       return 0;
   }
}
