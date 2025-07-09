package whileloop;
import java.util.Scanner;
public class palindrome {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int num=n;
		int rev=0;
		while(n>0) {
			int a=n%10;
			rev=rev*10+a;
			n/=10;
		}
		if(num==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
