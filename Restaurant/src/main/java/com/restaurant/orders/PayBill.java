package com.restaurant.orders;


import java.util.ArrayList;

public class PayBill {

    //return the amount for the order
    public double payableAmount(PlaceOrder order) {
        ArrayList<Order> orders = order.getOrder();
        double bill = 0.0;
        for (Order order1 : orders) {
            bill += order1.item.getCost();
        }
        return bill;
    }
}
