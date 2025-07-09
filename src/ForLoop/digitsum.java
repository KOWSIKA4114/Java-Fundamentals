package ForLoop;
import java.util.Scanner;
public class digitsum {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		int num=scr.nextInt();
		int n;
		int sum=0;
		for(int i=0;num>0;i++) {
			n=num%10;
			sum=sum+n;
			num/=10;
		}
		System.out.println(sum);
	}

}
