import java.util.LinkedList;

public class Supplier  {
	
	private String name; 
	private  LinkedList<Ingredient> ingredients = new LinkedList<>();
	
	Supplier(LinkedList<Ingredient> ingredients , String name){
		this.name = name;
		this.ingredients = ingredients;
	}
   
}
