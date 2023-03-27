import java.util.ArrayList;

public class GroceryList {
	ArrayList<GroceryItemOrder> list;

	public GroceryList() {
		list = new ArrayList<GroceryItemOrder>();
	}

	public void add(GroceryItemOrder item) {
		if (list.size() != 10)
			list.add(item);
	}

	public double getTotalCost() {
		double cost = 0;
		for (GroceryItemOrder groceryItemOrder : list)
			cost += groceryItemOrder.getCost();
		return cost;
	}
}
