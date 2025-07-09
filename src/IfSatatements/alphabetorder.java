package IfSatatements;
import java.util.Scanner;
public class alphabetorder {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		char ch1=scr.next().charAt(0);
		char ch2=scr.next().charAt(0);
		if(ch1<ch2) {
			System.out.println(ch1+","+ch2);
		}
		else {
			System.out.println(ch2+","+ch1);
		}
	}

}
