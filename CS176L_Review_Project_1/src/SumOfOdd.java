import java.util.Locale;
import java.util.Scanner;


public class SumOfOdd {
	public static void main(String[] args) {
		
	//peint the description
		System.out.println("SumOfOdd");
		System.out.println("Please enter a positive integer:");
		
	//use scanner to get an integer from the user
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		int n = in.nextInt();
		
	//print first n number of odd integers and at the same time calculating the sum
		System.out.println("First " + n + " positive odd integers are:");
		int sum = 0;
		for (int i = 1; i <= n; i++) 
		{
			System.out.println(2*i - 1 + " ");
			sum += 2*i - 1;
			
		}
		
	//print the sum with appropriate formating
		System.out.println("Sum of first " + n + " positive odd integers is: " + sum);
	}
	
	
}
