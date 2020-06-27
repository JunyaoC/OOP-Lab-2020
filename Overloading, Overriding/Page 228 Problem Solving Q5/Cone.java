public class Cone extends Circle{
		
	private double surfaceArea;
	private double height;

	public Cone(double _radius, double _h){
		super(_radius);
		this.height = _h;
	}

	public double getArea(){
		this.surfaceArea = (Math.PI * super.radius)*(super.radius + Math.sqrt((this.height*this.height) + (super.radius * super.radius)));
		return this.surfaceArea;
	}


}