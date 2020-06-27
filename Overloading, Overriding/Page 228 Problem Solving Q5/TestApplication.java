public class TestApplication{
	
	public static void main(String[] args){

		Shape testCircle = new Circle(4);
		Shape testCone = new Cone(4,5);
		Shape testCylinder = new Cylinder(4,5);
		Shape testRectangle = new Rectangle(4,8);
		Shape testTriangle = new Triangle(4,8);

		System.out.println("Area of Circle: " + Double.toString(testCircle.getArea()));
		System.out.println("Surface Area of Cone: " + Double.toString(testCone.getArea()));
		System.out.println("Surface Area of Cylinder: " + Double.toString(testCylinder.getArea()));
		System.out.println("Area of Rectangle: " + Double.toString(testRectangle.getArea()));
		System.out.println("Area of Triangle: " + Double.toString(testTriangle.getArea()));
	}

}