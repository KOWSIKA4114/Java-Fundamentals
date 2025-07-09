package arrays;

public class sumavg {
	public static void main(String[]args) {
		int arr[]= {20,30,40,50,60};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		float avg=(float) sum/arr.length;
		System.out.printf("%.2f",avg);
	}

}
