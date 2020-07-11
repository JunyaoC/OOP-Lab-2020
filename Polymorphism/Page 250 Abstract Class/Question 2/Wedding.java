class Wedding extends Card{
	
	public Wedding(String r){
		super(r);
	}

	public void greeting(){
		System.out.println("Dear " + recipient + ",\n");
		System.out.println("Happy Wedding!\n\n");
	}

}