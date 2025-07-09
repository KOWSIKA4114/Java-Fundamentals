package IfSatatements;
import java.util.Scanner;
public class upperlowercase {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		char ch=scr.next().charAt(0);
		if(ch>='a' && ch<='z') {
			char up=(char)(ch-32);
			System.out.println(up);
		}
		else if(ch>='A' && ch<='Z') {
			char low=(char)(ch+32);
			System.out.println(low);
		}
		else {
			System.out.println("invalid input");
		}
	}

}
