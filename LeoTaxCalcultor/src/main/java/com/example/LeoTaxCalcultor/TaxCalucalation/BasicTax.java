package com.example.LeoTaxCalcultor.TaxCalucalation;

import com.example.LeoTaxCalcultor.Products.ProductType;
import com.example.LeoTaxCalcultor.Store.ShoppingCartItem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BasicTax extends Tax{

    private static final Set<ProductType> exemptedProducts = new HashSet<>(Arrays.asList(ProductType.Food, ProductType.Book));
    private static final double tax = 10;

    @Override
    public boolean isTaxApplicable(ShoppingCartItem cartItem) {
        if(exemptedProducts.contains( cartItem.getProduct().getProductType())) {
            return false;
        }
        return true;
    }

    @Override
    public double getRate() {
        return tax;
    }
}
