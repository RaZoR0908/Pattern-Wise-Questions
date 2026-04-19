package PatternWiseQue;
import java.util.*;
/* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {
	public static List<List<Integer>> threesum(int[]arr){
		HashSet<List<Integer>>set=new HashSet<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++) {
			int left=i+1;
			int right=arr.length-1;
			while(left<right) {
            int sum=arr[i]+arr[left]+arr[right];
            if(sum==0) {
            	set.add(Arrays.asList(arr[i],arr[left],arr[right]));
            	left++;
            	right--;
            	}
            else if(sum<0) {
            	left++;
            }
            else {
            	right--;
            }
         }

		}
		return new ArrayList<>(set);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		List<List<Integer>> result=threesum(arr);
		System.out.println(result);
		sc.close();
		}
}