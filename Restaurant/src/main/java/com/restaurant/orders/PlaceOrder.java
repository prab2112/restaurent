package com.restaurant.orders;

import java.util.ArrayList;

import com.restaurant.items.Item;
import com.restaurant.menu.Menu;

//Complete the class PlaceHolder
public class PlaceOrder {
    private ArrayList<Order> orders;
    private ArrayList<Item> avaialbleItems;
    private Menu menu;

    //Inilatize constructor
    public PlaceOrder(Menu menu) {
        this.menu = menu;
    }

    public ArrayList<Item> getMenu() {
        avaialbleItems = menu.getItems();
        return avaialbleItems;
    }

    public ArrayList<Order> getOrder() {
        return orders;
    }

    public boolean orderItem(String item, int quantity) {
        ArrayList<String> in = new ArrayList<String>();
        avaialbleItems = menu.getItems();
        for (Item i : avaialbleItems) {
            in.add(i.getname());
        }

        if (!in.contains(item)) return false;
        else return true;
    }


}
