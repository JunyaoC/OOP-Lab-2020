public class CardTester{
	
	public static void main(String[] args){

		Card kadRaya = new KadRaya("John");
		Card birthdayCard = new Birthday("John",22);
		Card weddingCard = new Wedding("John");

		kadRaya.greeting();
		birthdayCard.greeting();
		weddingCard.greeting();

	}


}