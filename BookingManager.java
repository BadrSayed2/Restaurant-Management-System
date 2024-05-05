
import java.util.LinkedList;

public class BookingManager {
	
	private static LinkedList <FoodItem> menu = new LinkedList();
	private static LinkedList <Table> tables = new LinkedList();
	
	//-------------------------------------------------//
	
	public static LinkedList<FoodItem> getMenu() {
		return menu;
	}
	
	public static LinkedList<Table> getTables() {
		return tables;
	}
	
	//-------------------------------------------------//
	
	public static void addFoodItemToMenu(FoodItem food) {
		menu.add(food);
	}
	
	public static void removeFoodItemToMenu(FoodItem food) {
		menu.remove(food);
	}
	
	public static void addTable(Table table) {
		tables.add(table);
	}
	
	public static void removeTable(Table table) {
		tables.remove(table);
	}
	
	//-------------------------------------------------//
	
}
