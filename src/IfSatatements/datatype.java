package IfSatatements;
import java.util.Scanner;
public class datatype {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		char ch=scr.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println("Alphabets");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("Digits");
		}
		else {
			System.out.println("Special Characters");
		}
	}

}
