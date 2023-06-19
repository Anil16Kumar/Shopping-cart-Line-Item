package shoppingCartCustomer;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<LineItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    

    public void setItems(List<LineItem> items) {
		this.items = items;
	}



	public void addItem(LineItem item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (LineItem item : items) {
            totalCost += item.calculateLineItemCost();
        }
        return totalCost;
    }

    public List<LineItem> getItems() {
        return items;
    }

}

