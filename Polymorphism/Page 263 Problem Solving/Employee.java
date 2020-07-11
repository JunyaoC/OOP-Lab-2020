class Employee extends Person{
	
	public Employee(String _d){
		super(_d);
	}

	public String getdescription(){
		return "an employee with a salary of $" + super.desc;
	}


}