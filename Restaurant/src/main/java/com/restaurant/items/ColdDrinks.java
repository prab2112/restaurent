package com.restaurant.items;

import com.restaurant.items.container.*;

//complete the class ColdDrinks
public abstract class ColdDrinks implements Item {

    // return the category appropriate for Coldrinks
    public Category getCategory() {
        return Category.Drinks;
    }

    //return instance of Glass
    public Container getContainer() {
        return new Glass();
    }


}
