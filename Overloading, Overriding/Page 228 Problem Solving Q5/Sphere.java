public class Sphere extends Circle{
		
	private double surfaceArea;

	public Sphere(double _radius){
		super(_radius);
	}

	public double getArea(){
		this.surfaceArea = 4*Math.PI*(radius*radius);
		return this.surfaceArea;
	}


}