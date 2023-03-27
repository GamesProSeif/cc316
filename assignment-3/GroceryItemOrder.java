public class GroceryItemOrder {
	private String name;
	private int quantity;
	private double pricePerUnit;

	public GroceryItemOrder(String name, double pricePerUnit) {
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		quantity = 0;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return quantity * pricePerUnit;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}