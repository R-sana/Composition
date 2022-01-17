package customer.invoice;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer(12, "SSS", 10);
		System.out.println(c);
		Invoice i = new Invoice(01, c, 120);
		System.out.println(i);
		
		System.out.println("Discount :" + i.getAmountAfterDiscount());

	}

}
