package customer.account;

public class Account {
	
	private int id;
	private Customer customer;
	private double balance=0.0;
	
	public Account(int id, Customer customer, double balance) {
	//	super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int id, Customer customer) {
		//super();
		this.id = id;
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}
	@Override
	public String toString() {
	
		return customer.toString() + " balance = " + (Math.round(balance *100)/100);
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public double deposit(double amount) {
		return balance + amount;
			
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("amount withdrawn exceeds the current balance!");
		}
	}
	

}
