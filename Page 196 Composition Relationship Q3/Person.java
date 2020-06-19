public class Person {
	
	private Name name;
	private Address address;

	public Person(Address a){
		name = new Name("Mohammed", "Ali");
		this.address = a;
	}

	public String getName(){
		return name.getFullName();
	}

	public String toString(){
		return '\n' + getName() + '\n' + address.getFullAddress() + '\n';
	}

}