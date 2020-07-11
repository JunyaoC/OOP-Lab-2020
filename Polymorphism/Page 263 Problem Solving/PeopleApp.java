public class PeopleApp{
	
	public static void main(String[] args){

		Person student = new Student("computer science");
		Person employee = new Employee("50,000.00");

		System.out.println(student.getdescription());
		System.out.println(employee.getdescription());

	}

}