public class PCTest{
	public static void main(String[] args) {
		RAM r1 = new RAM("Corsair", "A12345", "Samsung","1G");
		Mouse m1 = new Mouse("Creative Labs FreePoint", "7300000000245", "Creative Labs");
		Keyboard k1 = new Keyboard("Ducky One 2 Mechanical Keyboard","DKON1787ST","Ducky");
		PC p1 = new PC(r1,m1,k1);
		p1.print();
	}
}