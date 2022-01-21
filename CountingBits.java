// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

// Example 1:

// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// Example 2:

// Input: n = 5
// Output: [0,1,1,2,1,2]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// 3 --> 11
// 4 --> 100
// 5 --> 101
public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int num = 0,r=0;
        for(int i = 0; i<=n; i++){
            num = Integer.parseInt(Integer.toBinaryString(i));
            while(num!=0){
                int d = num%10;
                r += d;
                num = num/10;
            }
            System.out.print(r);
            r=0;
        }
    }
}

//Here TC -> O(nlogn)

//Following is a O(n) solution 😉

// class Solution {
//     public int[] countBits(int n) {
//         int[] arr = new int[n+1];
//         arr[0] = 0;
//         if(n==0) return arr;
//         for(int i=1;i<n+1;i++){
//             if(i%2==0){
//                 arr[i] = arr[i/2];
//             }else{
//                 arr[i] = arr[i-1]+1;
//             }
//         }
//         return arr;
//     }
// }