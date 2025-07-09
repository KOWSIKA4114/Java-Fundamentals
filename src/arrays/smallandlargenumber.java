package arrays;

public class smallandlargenumber {
	public static void main(String[]args) {
		int arr[]= {20,50,12,18,30,25,26,60,40};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			if(n<min1) {
				min2=min1;
				min1=n;
			}
			else if(n<min2 && n!=min1) {
				min2=n;
			}
			if(n>max1) {
				max2=max1;
				max1=n;
			}
			else if(n>max2 && n!=max1) {
				max2=n;
			}
		}
		System.out.println("Smallest Number:"+min1+" "+min2);
		System.out.println("Largest Number:"+max1+" "+max2);
	}

}
