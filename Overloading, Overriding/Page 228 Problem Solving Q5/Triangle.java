public class Triangle extends Shape{
		
	private double base;
	private double height;

	public Triangle(double _b, double _h){
		this.base = _b;
		this.height = _h;
	}

	public double getArea(){
		this.area = (this.base * this.height) * 0.5;
		return this.area;
	}


}