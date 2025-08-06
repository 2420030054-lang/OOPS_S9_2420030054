package project4;
import java.util.Scanner;
public class smallest_largest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int [] a= new int [n];
		
		System.out.println("enter the first elemet of the array");
		  a[0]=sc.nextInt();
		int s=a[0],b=a[0];
		
		for(int i=1;i<n;i++) {
			System.out.println("enter the elements "+ (i+1) +" of the array");
			a[i]=sc.nextInt();
			if(a[i]<=s) {
				s=a[i];
			}
			if(a[i]>b) {
				b=a[i];
			}
		}
		System.out.println("smallest is "+s);
		System.out.println("largest is "+b);


	}

}
