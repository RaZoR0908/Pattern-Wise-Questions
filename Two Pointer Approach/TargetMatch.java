package PatternWiseQue;
import java.util.*;
/*
 Two Sum the input array is sorted in ascending order
 */
public class TargetMatch {
	public static int[] twoSum(int[]arr,int target) {
		int right=arr.length-1;
		int left=0;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(target==sum) {
				return new int[] {left+1,right+1};
			}
			else if(sum>target) {
				right--;
			}
			else {
				left--;
			}
		}
		return new int[] {-1,-1};
	}
      public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int target=sc.nextInt();
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
	    int result[]=twoSum(arr, target);
	    for(int i=0;i<result.length;i++) {
	    	System.out.print(result[i]+" ");
	    }
	sc.close(); 	   
}
}
