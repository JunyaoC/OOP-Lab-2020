public class Cylinder extends Circle{
		
	private double surfaceArea;
	private double height;

	public Cylinder(double _radius,double _h){
		super(_radius);
		this.height = _h;
	}

	public double getArea(){
		this.surfaceArea = (2 * super.getArea()) + (2 * Math.PI * this.radius * this.height);
		return this.surfaceArea;
	}


}