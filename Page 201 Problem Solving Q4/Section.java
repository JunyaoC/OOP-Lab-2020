public class Section{
	
	private String lectureName;
	private String sectionNum;

	public Section(String l, String s){
		lectureName = l;
		sectionNum = s;
	}

	public String getName(){
		return lectureName;
	}

	public String getSection(){
		return sectionNum;
	}


}