package Numbers_Conversion_Programming;

//WAJP TO CONVERSION BINARY TO DECIMAL 
 

public class Binary_To_Decimal {
public static void main(String[] args) {
	int n=111;
	int sum=0;
	int pow=1;
	while(n!=0) {
		int rem=n%10;
		sum=sum+rem*pow;
		pow=pow*2;
		n=n/10;
	}
	System.out.println(sum);
}
}

