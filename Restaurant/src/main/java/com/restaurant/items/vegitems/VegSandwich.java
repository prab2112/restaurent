package com.restaurant.items.vegitems;

import com.restaurant.items.Sandwich;


public class VegSandwich extends Sandwich {
    private String name;
    private double cost;
    private int quantity;

    //initialize constructor
    public VegSandwich(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    //Add your code here


    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getname() {
        return null;
    }
}
