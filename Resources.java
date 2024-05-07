import java.util.LinkedList;

public  class Resources {
	 
	 private static float money;
	 
	 private static LinkedList<Ingredient> ingredients = new LinkedList<>();
	 private static LinkedList<Supplier> suppliers = new LinkedList<>();
	 private static LinkedList<Employee> employees = new LinkedList<>();
	 
	 //------------------------------------------------------//
	 
	 public static void addSupplier(Supplier supplier){
			suppliers.add(supplier);
			suppliers.sort(null);
	}
	
	public static void removeSupplier(Supplier supplier){
		suppliers.remove(supplier);
		suppliers.sort(null);
	}
	
	 //------------------------------------------------------//
	
	public static void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public static void removeEmployee(Employee employee){
		employees.remove(employee);
	}
	
	 //------------------------------------------------------//
	
	public static void addIngredient(Ingredient ingredient){
		ingredients.add(ingredient);
		ingredients.sort(null);
	}
	
	public static void removeIngredient(Ingredient Ingredient){
		ingredients.remove(Ingredient);
		ingredients.sort(null);
	}
	
	 //------------------------------------------------------//
	
	public static float getMoney() {
		return money;
	}
	
	public static float buySomething(Sellable thing ) {  
		float amount = thing.getPrice() * thing.getQuantity();
		money-=amount;
		return amount;
	}
	
	public static void importMoney(float amount) {
		money+=amount;
	}
	
	public static void paySalaries() {
		int sum = 0;
		for(Employee e : employees) {
			sum += e.getSalary();           
		}
		money -= sum;
	}
	
	public static void payBills(float amount , String description) {
		money -= amount;
	}
	
	 //------------------------------------------------------//

}
