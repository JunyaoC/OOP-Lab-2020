public class Subject{
	
	private Section[] section;
	private String subjName;
	private String subjCode;

	public Subject(String n,String c){

		subjName = n;
		subjCode = c;

		section = new Section[10];

		if(c == "SCJ2153"){
			section[0] = new Section("Dr. Radiziah", "01");
			section[1] = new Section("Dr. Radiziah", "04");
			section[2] = new Section("Assoc. Prof. Dr. Norazah", "02");
		}

		if(c == "SCJ3253"){
			section[0] = new Section("Dr. Dayang Norhayati", "01");
		}

	}

	public void printInfo(){

		System.out.println("Subject Name: " + subjName);
		System.out.println("Subject Code: " + subjCode);

		for(int i=0;i<section.length;i++){
			if(section[i] != null){
				System.out.println("Section Code: " + section[i].getSection());
				System.out.println("Lecturer Name: " + section[i].getName());
			}
		}

		System.out.println("\n");

	}

}