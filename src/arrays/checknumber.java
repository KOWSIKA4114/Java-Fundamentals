package arrays;
import java.util.Scanner;
public class checknumber {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int arr[]= {20,14,16,22,24};
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(i);
				found=true;
				break;
			}
		}
			if(!found) {
				System.out.println("-1");
			}
	}

}
