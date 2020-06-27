public class TestApplication{
	
	public static void main(String[] args){

		Shape testCircle = new Circle(4);
		Shape testSphere = new Sphere(4);
		Shape testCylinder = new Cylinder(4,5);
		Shape testRectangle = new Rectangle(4,8);
		Shape testTriangle = new Triangle(4,8);

		System.out.println("Area of Circle: " + Double.toString(testCircle.getArea()));
		System.out.println("Surface Area of Sphere: " + Double.toString(testSphere.getArea()));
		System.out.println("Surface Area of Cylinder: " + Double.toString(testCylinder.getArea()));
		System.out.println("Area of Rectangle: " + Double.toString(testRectangle.getArea()));
		System.out.println("Area of Triangle: " + Double.toString(testTriangle.getArea()));
	}

}