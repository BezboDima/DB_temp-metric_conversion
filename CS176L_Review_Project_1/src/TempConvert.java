
public class TempConvert {
	public static void main(String[] args) {
		
	//print the description
		System.out.println("TempConvert");
		System.out.println("Fahrenheit                      Celsius");
		System.out.println("----------                      -------");
		
	//go through the loop skipping every second number to 212 for Fahrenheit -> Celsius
		double cel = 0;
		for (int i = 0; i <= 212; i+=2) 
		{

	//calculate Celsius
			cel = (i - 32) / 1.8;
			
	//print the table out with appropriate format
			System.out.printf("%3d                             %.2f", i,cel);
			System.out.print("\n");
		 
		}
		
	//print the description
		System.out.print("\n");
		System.out.println("Celsius                      Fahrenheit");
		System.out.println("-------                      ----------");
		
	//go through the loop skipping every second number to 100 for Celsius -> Fahrenheit
		double fah = 0;
		for (int i = 0; i <= 100; i+=2) 
		{
			
	//calculate Fahrenheit
			fah = i * 1.8 + 32;
			
	//print the table out with appropriate format
			System.out.printf("%3d                          %.2f", i,fah);
			System.out.print("\n");
		
		}
	}
}
