package ForLoop;
import java.util.Scanner;
public class floydstriangle {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int num=1;
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
