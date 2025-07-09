package arrays;

public class sortarray {
	public static void main(String[]args) {
		int arr[]= {20,50,12,18,30,25,26,60,40};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int n=arr[j];
					arr[j+1]=arr[j];
					arr[j]=n;
				}
			}
		}
		System.out.print("Sorted Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
