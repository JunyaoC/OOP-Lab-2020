public class PC{
	private RAM r;
	private Mouse m;
	private Keyboard k;

	public PC(RAM a, Mouse m, Keyboard k){
		r = a;
		this.m=m;
		this.k = k;
	}
	public void print () {
		System.out.println("Information about this PC's RAM");
		System.out.println("Its brand: "+r.getProductName());
		System.out.println ("Its serial number: "+ r.getSerial());
		System.out.println ("Its manufacturer :" + r.getBrand());
		System.out.println("Its speed: " + r.getSpeed());
		System.out.println ("Information about this PC's Mouse: ");
		System.out.println ("Its product name: " + m.getProductName());
		System.out.println ("Its serial number: " + m.getSerial());
		System.out.println("Its brand: "+m.getBrand());
		System.out.println ("Information about this PC's Keyboard: ");
		System.out.println ("Its product name: " + k.getProductName());
		System.out.println ("Its serial number: " + k.getSerial());
		System.out.println("Its brand: "+k.getBrand());
	}
}