

package control;
import java.util.Scanner;
public class student_marks {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.print("enter the marks: ");
int marks=sc.nextInt();
if(marks>50) {
	System.out.println("passed");
}
else {
	System.out.print("failed");
}

	}

}
