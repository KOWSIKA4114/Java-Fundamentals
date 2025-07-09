package arrays;

public class duplicateremove {
	public static void main(String[]args) {
		int arr[]={10,6,2,3,7,5,4};
		int sum=0;
		boolean skip=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==6) {
				skip=true;
			}
			if(!skip) {
				sum+=arr[i];
			}
			else if(skip && arr[i]==7) {
				skip=false;
			}
		}
		System.out.println("Sum:"+sum);
	}

}
