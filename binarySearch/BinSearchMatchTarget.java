package binarySearch;

public class BinSearchMatchTarget {
	public static void main(String[] args){
		int[] nums = {2,3,5,9,14,16,18};
		int target = 17;
		int start = 0, end = nums.length-1, mid;
		boolean contains = false;
		while(start <= end){
		    mid = start+(end-start)/2;

			if(nums[mid] < target){
				start = mid + 1;
			}

			else if(nums[mid]> target){
				end = mid - 1;
			}
			
			else{
			       contains = true;
			       break;
			}
		}
		
		if(contains){
		    System.out.println("Match found");
		    
		}
		else {
		    System.out.println("Match not found");
		    
		}
}
}
