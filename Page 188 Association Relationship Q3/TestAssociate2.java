import java.util.*;
public class TestAssociate2{

	public static void main(String args []){

		Course1 cs1 = new Course1 ("OOP", "SCP3103", 3);
		Course1 cs2 = new Course1 ("TP1","SCJ1013", 2);
		Course1 cs3 = new Course1 ("TP2","SCJ1213",1);
		Course1 cs4 = new Course1 ("KP", "SCP2113", 6);
		Course1 cs5 = new Course1 ("DM", "SCP1018", 10); ///new course
		
		Student1 s1 = new Student1 ("ALI","AC0021","2SCK");
		Student1 s2 = new Student1 ("ABU", "AC1122", "3SCK");
		Student1 s3 = new Student1 ("BEN", "AC0023", "3SCS");
		Student1 s4 = new Student1 ("ABU", "AC8888", "4SCSP"); // new student

		cs1.addStudent(s1);
		cs1.addStudent(s2);
		cs1.addStudent(s3);
		cs1.addStudent(s4);	// register for new student
		cs2.addStudent(s2);
		cs3.addStudent(s2);
		cs3.addStudent(s4); // register for new student

		cs5.addStudent(s1);	// register new course for everyone
		cs5.addStudent(s2);
		cs5.addStudent(s3);
		cs5.addStudent(s4);

		cs1.printAllInfo();
		cs2.printAllInfo();
		cs5.printAllInfo(); //print info for new course

		s1.printAllInfo();
		s2.printAllInfo();
		s3.printAllInfo();
		s4.printAllInfo();	//print info for new student

	}

}