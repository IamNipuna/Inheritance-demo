package java_inheritance_demo;

public class Main {

	public static void main(String[] args) {
		
		Students student01 = new Students("Nipun" , "Kumarasinghe" , "21UG1358");
		Students student02 = new Students("Nandun" , "Chamodya" , "21UG0379");
		
		Teachers teacher01 = new Teachers("Taniya Rathnayaka" , 85000.00);
		Teachers teacher02 = new Teachers("Mahima Weerasekara" , 97000.00);
		
		student01.setCourseName("coreJava");
		student01.setTeacherName(teacher01.getTeacherName());
		
		student02.setCourseName("AI");
		student02.setTeacherName(teacher02.getTeacherName());
		
		
		student01.displayDetails();
		student02.displayDetails();
		teacher01.displayDetails();
		teacher02.displayDetails();
		

	}

}
