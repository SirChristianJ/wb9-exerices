package com.pluralsight.NorthwindTradersSpringBoot;

import java.util.List;
import java.util.Objects;

public class Product implements ProductDAO{
    private int productID;
    private String name;
    private String category;
    private double price;

    public Product(){}

    public Product(int productID, String name, String category, double price) {
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "com.pluralsight.NorthwindTradersSpringBoot.Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, name, category, price);
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
