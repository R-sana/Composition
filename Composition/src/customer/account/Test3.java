package customer.account;

public class Test3 {

	public static void main(String[] args) {
	
		Customer c1 = new Customer(10, "Saman", 'f');
		System.out.println(c1);
		Account a1 = new Account(21, c1, 2895);
		System.out.println(a1);
	a1.deposit(1000);
	System.out.println(a1);

	}

}
