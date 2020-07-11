public class Animal{
	protected String kind;
	public Animal(){

	};

	public String toString(){
		return "I am a " + kind + " and I go " + ((Speakable)this).speak();
	}

}