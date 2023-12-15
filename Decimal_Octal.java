package Numbers_Conversion_Programming;

//WAJP to convet decmial to octal
 

public class Decimal_Octal {
	public static void main(String[] args) {
		int n=35;
		int temp =n;
		int rem=0;
		String oct="";
			while(n!=0) {	
				rem=n%8;
		//		System.out.println(rem);
				oct=rem+oct;
				n=n/8;
			}
			System.out.println("conversion of decimal to octal "+temp+":"+oct);
	}

}
