//package javaapplication4;

import java.util.ArrayList;
import java.util.List;


public class FoodItem extends Sellable   {

	private String name;

	//	here the name of the food Objects is the name of ingredient
	
	FoodItem( String n , int price){
		this.name = n;
		this.price = price ;
	}
        
        //adding function to select the quantity
    public void Select_Quantity( int quantity){
      this.quantity= quantity;
    }
	
	//---------------------------------------------------------//
	
    public void changeName(String name) {
		this.name = name;
	}

    public String getName() {
        return name;
    }
	
	//---------------------------------------------------------//
	
}
