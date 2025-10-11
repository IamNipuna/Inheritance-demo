package java_inheritance_demo;

public class Person {
	private String firstName;
	private String lastName;
	
	Person(String fNameX, String lNameX){
		firstName = fNameX;
		lastName = lNameX;
	}
	
	public void setFirstName(String set_first_Name) {
		firstName = set_first_Name;	
	}
	
	public void setLastName(String set_last_Name) {
		firstName = set_last_Name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
			
	public void displayDetails() {
		System.out.println("Full Name: " + getFirstName() + " " + getLastName());	
	}
}
