package composition.author.book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("Hebbard", "Hebbard@gmail.com", 'f');
		System.out.println(a1);
		Book b1 = new Book("java", a1, 120, 20);
		System.out.println(b1);
	}

}
