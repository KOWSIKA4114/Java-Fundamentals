package arrays;

public class maxandminvalue {
	public static void main(String[]args) {
		int arr[]= {30,12,18,25,26,20};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum value:"+max);
		System.out.println("Maximum value:"+min);
	}

}
