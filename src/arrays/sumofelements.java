package arrays;
public class sumofelements
{
	public static void main(String[]args)
	{
		int arr[]={20,50,12,18,30,25,12,26,60,40};
		for(int i=0;i<arr.length;i++)
		{
			boolean dup=false;
			for(int j=0;j<i;j++) 
			{
				if(arr[i]==arr[j])
				{
					 dup=true;
					break;
				}
			}
		if(!dup) 
		{
			System.out.print(arr[i]+" ");
		}
	  }
	}
}

