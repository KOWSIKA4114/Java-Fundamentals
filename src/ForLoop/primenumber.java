package ForLoop;

public class primenumber {
	public static void main(String[]args) {
		for (int i=10;i<99;i++) {
			boolean isprime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.println(i);
			}
		}
	}

}
