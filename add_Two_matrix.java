package Multidimession_Array_programmig;
 

public class add_Two_matrix {
public static void main(String[] args) {
	int a[][]= {{1,2},{3,4}};
	int b[][]= {{9,6},{7,6}};
int c[][]=new int[2][2];//to create the new Array for to stroed the sum elments

         for(int i=0;i<a.length;i++) {
        		for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+" ");
         }
        		System.out.println();
         }
         System.out.println("====================================");

         for(int i=0;i<b.length;i++) {
     		for(int j=0;j<b[i].length;j++) {
					System.out.print(b[i][j]+" ");
      }
     		System.out.println();
      }
      System.out.println("====================================");

	System.out.println("The sum of matrix is");
	int sum=0;
	        for(int i=0;i<a.length;i++) {
	        	for(int j=0;j<b.length;j++) {
	        		c[i][j]=a[i] [j]+b[i] [j];
	        		System.out.print(c[i][j] +" ");
	        	}
	        	System.out.println();
	        
	        }
}
}
