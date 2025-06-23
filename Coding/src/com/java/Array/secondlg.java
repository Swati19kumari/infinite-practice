package com.java.Array;

public class secondlg {

	 public static  int secondLargestElement(int[] nums) {
		    int lg=nums[0];
		    int slg=-1;

		    for(int i=1;i<nums.length;i++)
		    {
		        if(nums[i]>lg){
		            slg=lg;
		            lg=nums[i];
		            
		        }
		        else if(nums[i]!=lg && nums[i]>slg){
		            slg=nums[i];
		        }
		    }
		    return slg;
		    }
	
	
	public static void main(String[] args) {
		
		int nums[]= {8, 8, 7, 6, 5};
		int nums1[]= {10, 10, 10, 10, 10};
		System.out.println(secondLargestElement( nums1)); 
	}
}
