import java.io.*; 
import java.util.*; 

// Java program to print largest contiguous array sum 
// This problem is solved using Kadanes Algorithm

class MaximumSubArraySum 
{ 
	static int maxSubArraySum(int a[]) 
	{ 
		int size = a.length; 
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 

		for (int i = 0; i < size; i++) 
		{ 
			max_ending_here = max_ending_here + a[i]; 
			if (max_so_far < max_ending_here) 
				max_so_far = max_ending_here; 
			if (max_ending_here < 0) 
				max_ending_here = 0; 
		} 
		return max_so_far; 
	} 
	public static void main (String[] args) 
	{ 
		int [] a = {1,-2,4,-3,3,2}; 
		System.out.println("Maximum contiguous sum is " +maxSubArraySum(a)); 
	} 
} 
