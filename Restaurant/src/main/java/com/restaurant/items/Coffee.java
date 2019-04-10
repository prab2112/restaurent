package com.restaurant.items;


//Complete the class Coffee
public class Coffee extends HotDrinks {
    private String name;
    private double cost;
    private int quantity;

    //initialize constructor
    public Coffee(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }


    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getname() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
