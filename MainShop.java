package shoppingCartCustomer;

public class MainShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
//        ShoppingCart cart = new ShoppingCart();
//  
//        // Product -> id name price discount 
//        // Line Item -> id quantity product.
//        
//        Product product1 = new Product(1, "noodles", 20.0, 0.0);
//        LineItem lineItem1 = new LineItem(1, 4, product1);
//
//        Product product2 = new Product(2, "Dettol handwash", 50.0, 10.0);
//        LineItem lineItem2 = new LineItem(2, 5, product2);
//
//        
//        Product product3 = new Product(3, "dumbles", 1000.0, 70.0);
//        LineItem lineItem3 = new LineItem(3, 10, product3);
//
//        Product product4 = new Product(4, "namkin", 20.0, 0.0);
//        LineItem lineItem4 = new LineItem(4, 5, product4);
//
//        cart.addItem(lineItem1);
//        cart.addItem(lineItem2);
//        cart.addItem(lineItem3);
//        cart.addItem(lineItem4);
//   
//         
//        System.out.println("ITEMS IN THE CART :-)");
//        System.out.println("-----------------------");
//        for (LineItem item : cart.getItems()) {
//            //System.out.println("Item ID: " + item.getId());
//            System.out.println("Item Name: " + item.getProduct().getName());
//            System.out.println("Quantity: " + item.getQuantity());
//            System.out.println("Unit Price: Rs." + item.getProduct().getPrice());
//            System.out.println("Discount: " + item.getProduct().getDiscountPercent() + "%");
//            System.out.println("Cost: Rs." + item.calculateLineItemCost());
//            System.out.println("-----------------------");
//        }
//        double totalCost = cart.calculateTotalCost();
//        System.out.println("TOTAL COST: Rs." + totalCost);
		 ShoppingCart cart = new ShoppingCart();

	        Product product1 = new Product(1, "noodles", 20.0, 0.0);
	        LineItem lineItem1 = new LineItem(1, 4, product1);

	        Product product2 = new Product(2, "Dettol handwash", 50.0, 10.0);
	        LineItem lineItem2 = new LineItem(2, 5, product2);

	        Product product3 = new Product(3, "dumbbells", 1000.0, 70.0);
	        LineItem lineItem3 = new LineItem(3, 10, product3);

	        Product product4 = new Product(4, "namkeen", 20.0, 0.0);
	        LineItem lineItem4 = new LineItem(4, 5, product4);

	        cart.addItem(lineItem1);
	        cart.addItem(lineItem2);
	        cart.addItem(lineItem3);
	        cart.addItem(lineItem4);

	        System.out.println("ITEMS IN THE CART :-)");
	        System.out.println("+----------+------------------+----------+----------+----------+");
	        System.out.printf("| %-8s | %-16s | %-8s | %-8s | %-8s |\n", "Item ID", "Item Name", "Quantity", "Unit Price", "Cost");
	        System.out.println("+----------+------------------+----------+----------+----------+");

	        for (LineItem item : cart.getItems()) {
	            System.out.printf("| %-8d | %-16s | %-8d | %-8.2f | %-8.2f |\n", item.getId(),
	                    item.getProduct().getName(), item.getQuantity(), item.getProduct().getPrice(),
	                    item.calculateLineItemCost());
	        }

	        System.out.println("+----------+------------------+----------+----------+----------+");

	        double totalCost = cart.calculateTotalCost();
	        System.out.printf("TOTAL COST: Rs. %.2f\n", totalCost);
	  
	}

}
