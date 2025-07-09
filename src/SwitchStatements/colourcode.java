package SwitchStatements;
import java.util.Scanner;
public class colourcode {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		char ch=scr.next().charAt(0);
		if(ch>='a' && ch<='z') {
			ch=(char)(ch-32);
		}
		switch (ch) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
            System.out.println("Invalid Code");
            break;
		}
	}

}
