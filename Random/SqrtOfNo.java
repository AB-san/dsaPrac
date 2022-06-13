// Given a non-negative integer x, compute and return the square root of x.

// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 

// Example 1:

// Input: x = 4
// Output: 2
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

public class SqrtOfNo {
    public static void main(String[] args){
        int x = 9200;
        int low = 0, high = x;
        int mid = 0;
        while(low <= high){
            mid = (low + high)/2;
            if(mid*mid <= x && (mid+1)*(mid+1) > x){
                System.out.println(mid);
                break;
            }
            else if(mid*mid < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
    }
}

//Above solution works for smaller values
//Better Solution-

//     public int mySqrt(int x) {
//         if(x==0){
//             return 0;
//         }
//         int l = 1,h=x;
//         while(h>=l){
//             int mid = l+(h-l)/2;
//             if(mid > x/mid){
//                 h = mid-1;
//             }else if(mid < x/mid){
//                l = mid + 1;
//             }else{
//                 return mid;
//             }
//         }
//         return l-1;
//     }
