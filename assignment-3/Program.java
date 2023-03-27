public class Program {
	public static void main(String args[]) {
		GroceryList myCart = new GroceryList();

		GroceryItemOrder lollipop = new GroceryItemOrder("masasa", 3);
		lollipop.setQuantity(2);
		GroceryItemOrder cookie = new GroceryItemOrder("cookie", 35);
		cookie.setQuantity(3);

		myCart.add(lollipop);
		myCart.add(cookie);

		System.out.println("Total cost: " + myCart.getTotalCost());
	}
}