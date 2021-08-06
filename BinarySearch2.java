//binary search using recursive function
import java.util.*;
import java.lang.*;
public class BinarySearch2
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
		int high = n-1;
		int low = 0;
		int loc = printLogic(high,low,arr,x);
		if(loc == -1)
		{
			System.out.println("element not present");
		}
		else
		{
			System.out.println("element present at "+loc);
		}
	}
	public static int printLogic(int high, int low, int [] arr,int x)
	{
		int n = arr.length;
		if(low>high)
		{
			return -1;
		}
		if(x > arr[n-1] || x<arr[0])
		{
			return -1;
		}
		int mid = (high-low)/2;
		if(arr[mid] == x)
			return mid;
		else if(arr[mid] > x)
		{
			high = mid-1;
			return printLogic(high,low,arr,x);
		}
		else if(arr[mid]<x)
		{
			low = mid+1;
			return printLogic(high,low,arr,x);
		}
		return -1;
	}
}