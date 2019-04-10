package com.restaurant.items;

import com.restaurant.items.container.Container;

//Create the interface Item
public interface Item {
    //Add your code here
    int getQuantity();
    void setQuantity(int quantity);
    String getname();
    Category getCategory();
    double getCost();
    Container getContainer();
}
