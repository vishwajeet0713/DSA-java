package Basic_programmig;

//WAJP To count the number of factor of number
import java.util.Scanner;

//(manje eka number la kontay konta number divsible ahhe te ani te kiti number ahhet te count karyache) 
public class Count_the_factor {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	int a=sc.nextInt();
	int count=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			
			System.out.println("factor of a is:"+i);
			count++;
			
		}
	}
	System.out.println("Count is : "+count);
}
}
