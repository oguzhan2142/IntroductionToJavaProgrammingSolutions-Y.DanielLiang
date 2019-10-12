package Chapter13.exercise13;

public class Course implements Cloneable{

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {

		this.courseName = courseName; 
	}
	
	
	public void addStudent(String student) {
		
		students[numberOfStudents++] = student;
		
	}
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {

		Course cloneCourse = new Course(this.courseName);
		String [] studentsListClone = students.clone();
		cloneCourse.students = studentsListClone;
		
		return cloneCourse;
		
	}
	
	
	public String[] getStudents() {
		return students;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String stu) {
		
	}
	
	
}
