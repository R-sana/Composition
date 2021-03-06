package composition.author.book;


public class Author {

	private String name;
	private String email;
	private char gender; //'m' or'f'
	
	
	public Author(String name, String email, char gender) {
	//	super();
		this.name = name;
		this.email = email;
		this.gender = gender;
			}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	
@Override
public String toString() {
	
	return name +" (" + gender + ") at " + email; 
}
}
