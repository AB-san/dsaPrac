// Given an array, rotate the array by one position in clock-wise direction.
 

// Example 1:

// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 5 1 2 3 4
 

// Example 2:

// Input:
// N = 8
// A[] = {9, 8, 7, 6, 4, 2, 1, 3}
// Output:
// 3 9 8 7 6 4 2 1
 

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function rotate() which takes the array A[] and its size N as inputs and modify the array.

 

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

public class CyclicRotateBy1{
    public static void main(String[] args){
        int[] a = {9, 8, 7, 6, 4, 2, 1, 3};
        int t = a[a.length -1];
        for(int i = a.length -1; i>0; i--){
            a[i] = a[i-1];
        }
        a[0] = t;

        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}