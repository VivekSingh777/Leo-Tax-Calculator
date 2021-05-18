package com.example.LeoTaxCalcultor;

import com.example.LeoTaxCalcultor.Store.Checkout;
import com.example.LeoTaxCalcultor.Store.ShoppingCart;
import com.example.LeoTaxCalcultor.TaxCalucalation.TaxCalculation;

import java.util.Arrays;
import java.util.List;

public class LeoTaxCalculator {
    public static void main(String[] args) {
        List<String> test1 = Arrays.asList("1 book at 124.99", "1 music CD at 149.99", "1 chocolate bar at 40.85");
        List<String> test2 = Arrays.asList("1 imported bottle of perfume at 470.50", "1 imported box of chocolates at 100.00 ");
        List<String> test3 = Arrays.asList("1 imported bottle of perfume at 270.99", "1 bottle of perfume at 180.99", "1 packet of headache pills at 19.75","1 box of imported chocolates at 210.25");

        ShoppingCart cart1 = new ShoppingCart(test1);
        Checkout checkout= new Checkout(cart1);
        checkout.checkoutCart();

        ShoppingCart cart2 = new ShoppingCart(test2);
        Checkout checkout2= new Checkout(cart2);
        checkout2.checkoutCart();

        ShoppingCart cart3 = new ShoppingCart(test3);
        Checkout checkout3= new Checkout(cart3);
        checkout3.checkoutCart();

    }
}
