package com.restaurant.menu;

import java.util.ArrayList;

import com.restaurant.items.*;

//Complete the class Menu
public class Menu {
    private ArrayList<Item> items = new ArrayList<Item>();


    //Add your coce here
    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getname());
        }
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void removeItem(Item item) {
        if (!items.contains(item)) {
            System.out.println(item.getname() + "doesn't exist");
        } else {
            items.remove(item);
        }
    }
}
