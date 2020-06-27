public class Circle extends Shape{
		
	protected double radius;

	public Circle(double _r){
		this.radius = _r;
	}

	public double getArea(){
		this.area = Math.PI*radius*radius;
		return Math.PI*radius*radius;
	}


}