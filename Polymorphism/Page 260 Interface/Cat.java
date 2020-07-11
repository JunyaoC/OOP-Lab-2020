public class Cat extends Animal implements Speakable{
	

	public Cat(){
		kind = "cat";
	}

	public String speak(){
		return "meow";
	}

}