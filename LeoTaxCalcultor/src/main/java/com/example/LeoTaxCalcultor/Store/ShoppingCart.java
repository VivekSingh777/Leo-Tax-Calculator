package com.example.LeoTaxCalcultor.Store;

import com.example.LeoTaxCalcultor.Products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShoppingCart {

    private static final String CART_ITEM_REGEX = "(\\d+) ([\\w\\s]* )at (\\d+.\\d{2})";

    private List<ShoppingCartItem> shoppingCartItems;

    public void ShoppingCart() {
        shoppingCartItems = new ArrayList<>();
    }

    public ShoppingCart(List<String> cartItemString) {
        this.shoppingCartItems = parseItems(cartItemString);
    }

    private List<ShoppingCartItem> parseItems(List<String> cartItemString){
        List<ShoppingCartItem> cartItems = new ArrayList<>();
        Pattern pattern = Pattern.compile(CART_ITEM_REGEX);
        for(String inp: cartItemString){
            Matcher matcher = pattern.matcher(inp);
            matcher.find();
            cartItems.add(new ShoppingCartItem(Integer.parseInt(matcher.group(1)), matcher.group(2), Double.parseDouble(matcher.group(3))));
        }
        return cartItems;
    }

    public ShoppingCart()
    {
        shoppingCartItems = new ArrayList<ShoppingCartItem>();
    }

    public void addItemToCart(ShoppingCartItem item)
    {
        shoppingCartItems.add(item);
    }

    public List<ShoppingCartItem> getItemsFromCart()
    {
        return shoppingCartItems;
    }

    public int getCartSize()
    {
        return shoppingCartItems.size();
    }

    public double getCost() {
        double cost=0;
        for(ShoppingCartItem item : shoppingCartItems){
            cost += item.getTotalCost();
        }
        return cost;
    }

    public double getTax() {
        double tax = 0;
        for(ShoppingCartItem item : shoppingCartItems){
            tax += item.getTotalTax();
        }
        return tax;
    }



}
