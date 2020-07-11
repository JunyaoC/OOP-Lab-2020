import java.util.Scanner;
import java.io.*;

public class TestSum{
	public static void main(String[] args) throws IOException {

		double num[] = new double[5];
		double total = 0;

		Scanner in = new Scanner(System.in);
		try{
			System.out.println("How many floating point numbers do you want to input?");
			int max = in.nextInt();

			System.out.println("Enter "+ max + " numbers");

			for(int i =0; i<max; i++){
				num[i] = in.nextDouble();
				total+=num[i];
			}
		}
		catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
		}
		
		System.out.println("End of program");
		System.out.println("Total: "+total);
	}
}