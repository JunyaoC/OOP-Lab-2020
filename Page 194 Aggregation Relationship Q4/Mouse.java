public class Mouse {
	private String productname, serialnumber, brand;
	
	public Mouse (String a, String b, String c) {
		productname=a;
		serialnumber=b;
		brand=c;
	}

	public String getProductName() {
		return productname;
	}

	public String getSerial(){
		return serialnumber;
	}

	public String getBrand() {
		return brand;
	}
}