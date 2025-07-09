package IfSatatements;
import java.util.Scanner;
public class positivenegativenum {
	public static void main(String[]args) {
	Scanner scr=new Scanner(System.in);
	int a=scr.nextInt();
	if(a>0){
		System.out.println("Positive Number");
	}
	else if(a<0) {
		System.out.println("Negative Number");
	}
	else {
		System.out.println("Zero");
	}
}
}
