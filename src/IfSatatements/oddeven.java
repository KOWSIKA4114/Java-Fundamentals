package IfSatatements;
import java.util.Scanner;
public class oddeven {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		int num=scr.nextInt();
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
