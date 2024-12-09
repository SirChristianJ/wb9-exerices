package com.pluralsight.NorthwindTradersSpringBoot;

import java.util.ArrayList;
import java.util.List;

public class SimpleProductDAO implements ProductDAO{
    private List<Product> products;

    public SimpleProductDAO(){
        products = new ArrayList<>();
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
