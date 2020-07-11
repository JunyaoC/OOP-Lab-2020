class KadRaya extends Card{
	public KadRaya(String r){
		super(r);
	}

	public void greeting(){
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Selamat Hari Raya!\n\n");
	}
}