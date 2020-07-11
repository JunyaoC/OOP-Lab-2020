import java.util.*;

class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}

class excep4{
	
	public static void main(String[] a) {
		
		String st1;

		Scanner in = new Scanner(System.in);
		st1 = in.nextLine();
		if(st1.equals("Hello"))
			System.out.println("String is right");
		else
			try{
				throw new MyException("Invalid String");
			}
			catch(MyException ex){
				System.out.println(ex.getMessage());
			}

	}

}