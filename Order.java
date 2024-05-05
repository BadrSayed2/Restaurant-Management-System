
import java.util.Date;
import java.util.LinkedList;

public class Order {

	private  LinkedList<FoodItem> foodItems = new LinkedList<>();
	private Date orderStartTime ;
	public boolean isDelivery;
	private float Price;
	private Date OrderEndDate;
	
	//-----------------------------------------------------------//
	
	Order(LinkedList<FoodItem> fooditems , boolean isdelivery , int Orderduration ){
	
		foodItems = fooditems;
		this.orderStartTime = new Date();//indicates current date
		this.isDelivery = isdelivery;
		//order duration is in seconds
		this.OrderEndDate = new Date(this.orderStartTime.getTime() + Orderduration * 1000);
		this.Price = this.calcPrice();
	}
	
	
	
	private float calcPrice() {
		float sum = 0;
		for(FoodItem foodItem : foodItems){
			sum += foodItem.getPrice() * foodItem.getQuantity();
		}
		
		return sum;
	
	}
	
	//-----------------------------------------------------------//
	
	public int getOrderRemainingDuration() { //returns remaining time in seconds
		return (int)( (this.OrderEndDate.getTime() - this.orderStartTime.getTime()) * 1000);
	}
	public float getPrice() { return this.Price; }

}
