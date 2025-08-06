package control;
import java.util.Scanner;
public class display_day {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number of the day: ");
		int day=sc.nextInt();
		switch(day) {
		case 1:
			System.out.print("MONDAY");
		case 2:
		    System.out.print("TUESDAY");
		case 3:
			System.out.print("WEDNESDAY");
		case 4:
			System.out.print("THURSDAY");
		case 5:
			System.out.print("FRIDAY");
		case 6:
			System.out.print("SATURDAY");
		case 7:
			System.out.print("SUNDAY");
		}
			
	}

}
