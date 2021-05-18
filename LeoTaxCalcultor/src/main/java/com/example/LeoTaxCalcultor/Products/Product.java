package com.example.LeoTaxCalcultor.Products;

public class Product {


    protected String name;
    protected double price;
    protected ProductType productType;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.productType = getProductTypeFromName(name);
    }

    private ProductType getProductTypeFromName(String name) {
        if(name.contains("chocolate") || name.contains("chocolates")){
            return ProductType.Food;
        }
        else if(name.contains("book")){
            return ProductType.Book;
        }
        else if(name.contains("pills")){
            return ProductType.Medical;
        }
        else {
            return ProductType.Misc;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
