
public class Table {
	private int TableNumber;
	private Order currentOrder;
	private Order nextOrder;
	
	Table(int Tablenumber){
		this.TableNumber = Tablenumber;
	}
	
	//----------------------------------------------//
	
	
	public Order getCurrrentOrder() {
		return this.currentOrder;
	}
	
	public Order getNextOrder() {
		return this.nextOrder;
	}
	
	//----------------------------------------------//
	
	public boolean isEmpty() {
		return (this.getCurrrentOrder() == null)? true :false ;
	}
	
	public boolean isNextOrderEmpty() {
		return (this.getNextOrder() == null)? true :false ;
	}
	
	//----------------------------------------------//
	
	public void bookTable(Order order) {
		this.currentOrder = order;
	}
	
	public void bookTableNext(Order order) {
		this.nextOrder = order;
	}
	
	//----------------------------------------------//
}
