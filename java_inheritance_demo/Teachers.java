package java_inheritance_demo;


public class Teachers extends Person {
	
	private String teacherName;
	private double salary;

	 Teachers(String teacher_name, double salaryX){
		super(null, null);
		teacherName = teacher_name;
		salary = salaryX;
	}
	
	public void setTeacherName(String newTeacherName){
		teacherName = newTeacherName;
	}
	public void setSalary(double updatedSalary){
		salary = updatedSalary;
	}

	public String getTeacherName() {
		return teacherName;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public void displayDetails() {
		
		System.out.println("");
		System.out.println("Teacher Info:");
		System.out.println("Full Name: " + getTeacherName());
		System.out.println("Salary: " + getSalary());
		System.out.println("");
	}
	
}