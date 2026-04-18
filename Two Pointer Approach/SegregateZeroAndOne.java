package PatternWiseQue;
import java.util.*;
/*
Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.
*/
public class SegregateZeroAndOne {
	public static int[] segregate(int arr[]) {
		int right=arr.length-1;
        int left=0;
        while(left<right){
            if(arr[left]==0){
                left++;
            }
            else if (arr[right]==1){
                right--;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
	}
	  public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[]result=segregate(arr);
		for(int i=0;i<result.length;i++) {
			System.err.print(result[i]+" ");
		}
		sc.close();
		}
      
}
