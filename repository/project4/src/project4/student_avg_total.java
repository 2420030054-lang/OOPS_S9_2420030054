package project4;
import java.util.Scanner;
public class student_avg_total {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of subjects");
		int n=sc.nextInt();
		int[] a= new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.print("enter " +(i+1)+"  Subject marks");
					
			a[i]=sc.nextInt();
			
			sum=sum+a[i];
		}
		int avg=sum/n;
		for(int i=0;i<n;i++) {
			System.out.println("the marks of "+i+1+" subject are "+a[i]);
			
		}
System.out.println("the total is "+sum+" the avg is "+avg);
	}

}
