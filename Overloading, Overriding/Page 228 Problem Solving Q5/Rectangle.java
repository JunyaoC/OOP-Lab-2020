public class Rectangle extends Shape{
		
	private double width;
	private double height;

	public Rectangle(double _w, double _h){
		this.width = _w;
		this.height = _h;
	}

	public double getArea(){
		this.area = this.width * this.height;
		return this.area;
	}


}