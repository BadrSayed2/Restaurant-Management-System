
import java.util.LinkedList;

public class Order {

	private static LinkedList<FoodItem> foodItems = new LinkedList<>();
	
	public int calcPrice() {
		int sum = 0;
		for(FoodItem foodItem : foodItems){
			sum += foodItem.getPrice() * foodItem.getQuantity();
		}
		
		return sum;
	
	}
	
}
