package Chapter11.exercise02;

public class Test {

	public static void main(String[] args) {

		
		Person person = new Person("Oguzhan", "Istanbul", 1111111111, "test@test.com");
		Student student = new Student("Oguzhan", "Istanbul", 1111111111, "test@test.com", Student.JUNIOR);
		Employee employee = new Employee("Oguzhan", "Istanbul", 1111111111, "test@test.com","Beykent" , 3000);
		Faculty faculty = new Faculty("Oguzhan", "Istanbul", 1111111111, "test@test.com",8,"Expert");
		Staff staff = new Staff("Oguzhan", "Istanbul", 1111111111, "test@test.com","Software Engineer");
		
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		
	}

}
