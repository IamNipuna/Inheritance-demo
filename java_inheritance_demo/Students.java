package java_inheritance_demo;

public class Students extends Person {
	
	private String student_ID;
	private String teacherName;
	private String courseName;

	Students(String fNameX, String lNameX, String student_ID_x) {
		super(fNameX, lNameX);
		student_ID = student_ID_x;
	}
	
	public void setStudentID(String setID) {
		student_ID = setID;
	}
	public void setTeacherName(String setTeacherName){
		teacherName = setTeacherName;
	}
	public void setCourseName(String course){
		courseName = course;
	}
	public String getStudentId() {
		return student_ID;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public String getCourse() {
		return courseName;
	}
	@Override
	public void displayDetails() {
		
		System.out.println("");
		System.out.println("Student Info:");
		System.out.println("Full Name: " + getFirstName() + " " + getLastName());
		System.out.println("Student ID: " + getStudentId());
		System.out.println("Course Name: " + getCourse());
		System.out.println("Teacher: " + getTeacherName());
		System.out.println("");
	}
	
}
