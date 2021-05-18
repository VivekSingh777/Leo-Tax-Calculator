package com.example.LeoTaxCalcultor.Receipt;

import com.example.LeoTaxCalcultor.Store.ShoppingCart;
import com.example.LeoTaxCalcultor.Store.ShoppingCartItem;

public class Receipt {
    public void print(ShoppingCart shoppingCart) {
        System.out.println("=====================================");
        if(shoppingCart.getCartSize()<=0) {
            System.out.println("No Item of cart. Receipt not available");
            return;
        }
        for(ShoppingCartItem item : shoppingCart.getItemsFromCart()){
            System.out.printf("%d %s : %f\n", item.getQuantity(), item.getProduct().getName(),item.getTotalCost());
        }
        System.out.printf("Tax: %f\n", shoppingCart.getTax());
        System.out.printf("Total: %f\n", shoppingCart.getCost());
        System.out.println("=====================================");
    }
}
