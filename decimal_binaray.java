package Numbers_Conversion_Programming;

//wajp to conversion decimal to binary
 

public class decimal_binaray {
public static void main(String[] args) {
	int n=8;
	int rem=0;
	String bin="";
	while(n!=0) {
		 rem=n%2;
//		System.out.println(rem);
		 bin=rem+bin;
		n=n/2;
	}
System.out.println("decimal to binary "+bin);
}
}

