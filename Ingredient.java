import java.util.LinkedList;

public class Ingredient implements Sellable, Comparable<Sellable> {
//	here the name of the Ingredient Objects is the name of ingredient
	LinkedList<Supplier> suppliers = new LinkedList<>();
	private int quantity;
	private float price;
	
	 //------------------------------------------------------//
	
	Ingredient(int quantity , int price){
		this.quantity = quantity;
		this.price = price ;
	}
	
	 //------------------------------------------------------//
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public float getPrice() {return this.price;}
	
	public void changePrice(float newPrice) {
		this.price = newPrice;
		
	}
	
	 //------------------------------------------------------//
	
	public void addSupplier(Supplier supplier){
		this.suppliers.add(supplier);
		this.suppliers.sort(null);
	}
	
	public void removeSupplier(Supplier supplier){
		this.suppliers.remove(supplier);
		this.suppliers.sort(null);
	}
	
	 //------------------------------------------------------//
	
	public int compareTo(Sellable other) {
	       if(this.getPrice() > other.getPrice())
	    	   return 1;
	       else if (this.getPrice() == other.getPrice())
	    	   return 0;
	       return -1;
	}
	
}
