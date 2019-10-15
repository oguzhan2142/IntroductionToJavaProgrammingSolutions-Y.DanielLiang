package Chapter11.exercise05;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		Course math = new Course("Math");
		math.addStudent("Oguzhan");
		math.addStudent("X person");
		System.out.println(math.getNumberOfStudents());
		math.dropStudent("Oguzhan");
		System.out.println(math.getNumberOfStudents());
		
	}

	
}
