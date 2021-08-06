//binary search using iterative method
import java.util.*;
import java.lang.*;
public class BinarySearch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("size of arr:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter sorted array:");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		System.out.println("enter element to be found:");
		int x = sc.nextInt();
		//code for binary search
		int high = n-1;
		int low = 0;
		int mid;
		int loc=-1;
		while(low<=high)
		{
			mid = (high-low)/2;
			if(x>arr[n-1] || x<arr[0])
			{
				break;
			}
			if(arr[mid] == x)
			{
				loc = mid;
				break;
			}
			else if(arr[mid] > x)
			{
				high = mid-1;
				continue;
			}
			else if(arr[mid] < x)
			{
				low = mid+1;
				continue;
			}
			else
				break;
		}
		if(loc == -1)
		{
			System.out.println("element not present");
		}
		else
		{
			System.out.println("element present at "+loc);
		}
	}
}