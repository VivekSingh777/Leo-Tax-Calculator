package com.example.LeoTaxCalcultor.Store;

import com.example.LeoTaxCalcultor.Products.Product;

public class ShoppingCartItem {
    private Product product;
    private int quantity;
    private double totalTax;
    private boolean isImported;

    public ShoppingCartItem(int quantity, String name, double price) {

        this.product = new Product(name, price);
        this.quantity = quantity;
        if(name.contains("imported")) {
            this.isImported = true;
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }


    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }

    public double getTotalCost() {
        return quantity*(totalTax + product.getPrice());
    }
}
