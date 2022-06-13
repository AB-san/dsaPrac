// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


// Example 1:

// Input:
// N = 5
// Arr[] = {1,2,3,-2,5}
// Output:
// 9
// Explanation:
// Max subarray sum is 9
// of elements (1, 2, 3, -2, 5) which 
// is a contiguous subarray.
// Example 2:

// Input:
// N = 4
// Arr[] = {-1,-2,-3,-4}
// Output:
// -1
// Explanation:
// Max subarray sum is -1 
// of element (-1)

import java.lang.Integer;
public class MaxSumSubArray {
    public static void main (String[] args) {
        int[] a = {1, 2, 3, -2, 5};
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;

        for(int i = 0; i<a.length; i++){
            local_max = max(a[i],local_max+a[i]);
            if(local_max>global_max){
                global_max = local_max;
            }
        }
        System.out.println(global_max);
    }
    static int max(int x, int y){
        if(x>=y)
            return x;
        else
            return y;
    }
}