package com.restaurant.items;

import com.restaurant.items.container.*;

//complete the class SandWich
public abstract class Sandwich implements Item {
    private Category category;

    // return the category appropriate for Coldrinks
    public Category getCategory() {
        return Category.Snacks;
    }

    //return instance of Glass
    public Container getContainer() {
        return new Wrapper();
    }


}
