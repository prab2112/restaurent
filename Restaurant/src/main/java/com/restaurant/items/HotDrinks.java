package com.restaurant.items;

import com.restaurant.items.container.*;

//complete the class HotDrinks
public abstract class HotDrinks implements Item {

    // return the category appropriate for Coldrinks
    public Category getCategory() {
        return Category.Drinks;
    }

    // Return the container for HotDrinks
    public Container getContainer() {
        return new Glass();
    }

}
