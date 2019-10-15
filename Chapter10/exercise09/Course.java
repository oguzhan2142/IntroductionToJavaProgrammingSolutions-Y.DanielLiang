package Chapter10.exercise09;

import java.util.ArrayList;

public class Course {

	
	
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	
	
	public Course(String courseName) {
		this.courseName = courseName;

	}
	
	
	public void addStudent(String student) {
		
		students.add(student);
		
	}


	public String getCourseName() {
		return courseName;
	}


	public ArrayList<String> getStudents() {
		return students;
	}


	public int getNumberOfStudents() {
		return students.size();
	}
	
	public void dropStudent(String student) {
		

		 students.remove(student);
		
		
	}
	public void clear() {
		
		
		students.clear();
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Course math = new Course("Math");
		
		
		math.addStudent("Jack");
		math.addStudent("Debra");
		math.addStudent("Mario");
		math.dropStudent("Jack");

		
		for (int i = 0; i < math.getNumberOfStudents(); i++) {
			
			System.out.println(math.getStudents().get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
