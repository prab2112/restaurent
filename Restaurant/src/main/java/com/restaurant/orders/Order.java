package com.restaurant.orders;

import com.restaurant.items.Item;


public class Order {
    Item item;
    int quantity;

    //Initialize constructor
    Order(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
}
