
public class FoodItem implements Sellable , Comparable<Sellable>  {

	//	here the name of the food Objects is the name of ingredient
	private String name;
	private float price;
	public int quantity =0;
	
	FoodItem( String n , int price, int quantity ){
		this.name = n;
		this.quantity = quantity;
		this.price = price ;
	}
	
	//---------------------------------------------------------//
	
	public float getPrice() { return this.price; }
	
	public void changePrice(float newPrice) {
		this.price = newPrice;
	}

	public int getQuantity() {
		return this.quantity;
	}
	
	//---------------------------------------------------------//
	
	public int compareTo(Sellable other) {
		   if( this.getPrice() > other.getPrice() )
			   return 1;
	       else if ( this.getPrice() == other.getPrice())
	    	   return 0;
	       return -1;
	}
	
	//---------------------------------------------------------//
	
}
