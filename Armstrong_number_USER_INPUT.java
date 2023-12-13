package Basic_programmig;

import java.util.Scanner;

public class Armstrong_number_USER_INPUT {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number ");
	int n=sc.nextInt();
	int m=n;
	int temp=n;
	int count =0;
	int sum=0;
	
	while(n!=0) {
		count++;
		n=n/10;
	}
	System.out.println(count);
	while(temp !=0) {
		int rem=temp%10;
		int pro=1;
		for (int i = 1; i <= count ; i++) {
			pro =pro*rem;
			
		}
		sum=sum+pro;
		
		temp=temp/10;
		
	}
	System.out.println(sum);
			
if(m==sum) {
	System.out.println("it is amstrong");
}else {
	System.out.println("it is not a amstrong");
}

}
}

