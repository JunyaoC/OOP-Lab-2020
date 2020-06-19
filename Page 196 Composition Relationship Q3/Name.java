public class Name{
	
	private String firstname;
	private String lastname;

	public Name(String f, String l){
		firstname = f;
		lastname = l;
	}

	public String getFullName(){
		return firstname + " " + lastname;
	}


}