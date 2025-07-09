package IfSatatements;
import java.util.Scanner;
public class interest {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		String gender=scr.nextLine();
		int age=scr.nextInt();
		if(gender.equals("female")&&(age>=1 && age<=58)) {
			System.out.println(" percentage of interest = 8.2%");
		}
		else if(gender.equals("female")&&(age>=59 && age<=100)) {
			System.out.println(" percentage of interest = 9.2%");
		} 
		else if(gender.equals("male")&&(age>=1 && age<=58)) {
			System.out.println(" percentage of interest = 8.4%");
		}
		else if(gender.equals("male")&&(age>=59 && age<=100)) {
			System.out.println(" percentage of interest = 10.5%");
		}
		else {
			System.out.println("invalid input");
		}
	}

}
