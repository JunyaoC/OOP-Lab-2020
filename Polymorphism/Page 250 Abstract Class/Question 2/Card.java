public abstract class Card{
	protected String recipient;

	Card(String r){
		recipient = r;
	}

	public String getRecipient(){
		return recipient;
	}

	public abstract void greeting();
}