package com.restaurant.items.nonvegitems;

import com.restaurant.items.*;

public class NonVegSandwich extends Sandwich {
    private String name;
    private double cost;
    private int quantity;

    //initialize costructor
    public NonVegSandwich(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    // Add your code here


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getname() {
        return null;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
