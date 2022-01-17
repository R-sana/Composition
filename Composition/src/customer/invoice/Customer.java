package customer.invoice;

public class Customer {
	
 private int id;
private String name;
private int discount;


public Customer(int id, String name, int discount) {
	//super();
	this.id = id;
	this.name = name;
	this.discount = discount;
			}


public int getDiscount() {
	return discount;
}


public void setDiscount(int discount) {
	this.discount = discount;
}


public int getId() {
	return id;
}


public String getName() {
	return name;
}

@Override
	public String toString() {
		
		return name+ " (" +id+") " + "("+discount+"%)";
	}


}