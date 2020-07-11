public class Cow extends Animal implements Speakable{
	

	public Cow(){
		kind = "cow";
	}

	public String speak(){
		return "moo";
	}

}