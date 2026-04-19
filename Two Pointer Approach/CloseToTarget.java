package PatternWiseQue;
import java.util.*;
/*Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
Return the sum of the three integers.
*/
public class CloseToTarget {
  public static int targetSum(int[]arr,int target) {
	  Arrays.sort(arr);
	  int sumcloset=arr[0]+arr[1]+arr[2];
	  for(int i=0;i<arr.length-2;i++) {
		  int left=i+1;
		  int right=arr.length-1;
		  while(left<right) {
          int sum=arr[i]+arr[left]+arr[right];
          if(Math.abs(target-sum)<Math.abs(target-sumcloset)) {
        	           sumcloset=sum;
        	  }
          if(sum<target) {
        	  left++;
          }
          else if (sum>target){
        	  right--;
          }
          else {
        	  return sum;
          }
          }
	  }
	  return sumcloset;
  }
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int target=sc.nextInt();
	int n=sc.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int result=targetSum(arr, target);
	System.out.println(result);
	sc.close();
	}
      
}
