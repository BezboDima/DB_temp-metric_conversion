
public class US2Metric {
public static void main(String[] args) {
	
	//Print description
	System.out.println("US2Metric");
	System.out.println("inches     sentimeters     tpounds    kilograms");
	System.out.println("------     -----------     -------    ---------");

	//initialize variables and go through 50 elements
	double sm = 0;
	double km = 0;
	for (int i = 1; i < 51; i++) 
	{
		
	//calculate sm and km
		sm = i * 2.54;
		km = i * 0.453592;
		
	//print each row with appropriate formating
		System.out.printf("%02d          %.2f           %02d         %.2f", i, sm, i, km);
		System.out.print("\n");
			
	}

}
}
