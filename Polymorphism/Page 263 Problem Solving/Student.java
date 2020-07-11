class Student extends Person{
	
	public Student(String _d){
		super(_d);
	}

	public String getdescription(){
		return "a student majoring in " + super.desc;
	}


}