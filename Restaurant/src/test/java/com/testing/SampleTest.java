package com.testing;
import junit.framework.TestCase;

import com.restaurant.items.Coffee;
import com.restaurant.items.ColdDrinks;
import com.restaurant.items.HotDrinks;
import com.restaurant.items.Juices;
import com.restaurant.menu.Menu;
import com.restaurant.orders.PlaceOrder;

public class SampleTest extends TestCase {
	HotDrinks item1;
	ColdDrinks item2;
	Menu menu;
	//Adding items to the menu
	public void addItems(){
		item1 = new Coffee("Black Coffee", 110.67);
		item2 = new Juices("Slice", 25);
		menu =new Menu();
		menu.addItem(item1);
		menu.addItem(item2);
	}
	// This test verifies if the items are added to the menu and verifies the quantity of the items
	public void test1(){
		addItems();
		String name= item1.getname();
		//Verifying name
		assertTrue(name.equals("Black Coffee"));
		int q = item1.getQuantity();
		assertTrue(q==0);
		//Verifying the quantity of the items
		item1.setQuantity(3);
		item2.setQuantity(4);
		q=item2.getQuantity();
		assertTrue(q==4);
		
		
	}
	//This test verifies the remove operation of the item
	public void test2(){
		addItems();
		item1.setQuantity(3);
		item2.setQuantity(4);
		int countOfItems=menu.getItems().size();
		assertTrue(countOfItems==2);
		//removing  item
		menu.removeItem(item2);
		PlaceOrder order=new PlaceOrder(menu);
		//The order must fail as the item is removed from the menu
		boolean success=order.orderItem("Slice", 3);
		assertFalse(success);
		
	}
}
