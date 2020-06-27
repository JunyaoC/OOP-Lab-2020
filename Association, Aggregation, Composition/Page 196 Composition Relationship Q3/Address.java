public class Address{
	
	private String street;
	private String city;
	private String state;
	private long zip;

	public Address(String _street, String _city, String _state, long _zip){
		this.street = _street;
		this.city = _city;
		this.state = _state;
		this.zip = _zip;
	}

	public String getFullAddress(){
		return street + "\n" + city + "," + state + " " + zip;
	}

}