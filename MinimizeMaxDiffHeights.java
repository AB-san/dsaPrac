import java.util.Arrays;

public class MinimizeMaxDiffHeights {
    public static void main(String[] args){
        int[] arr = {5,5,8,6,4,10,3,8,9,10};
        Arrays.sort(arr);
        int n =arr.length;
        int k =5;
        int min = arr[0],max =arr[n-1]; // to handle cases when we add/subtract k in each term which leads to same result tht is arr[n-1]-arr[0]
        int result = max-min;
        for(int i = 1;i<n;i++){
            if(arr[i] - k >=0 && i<n){
                max = Math.max(arr[i-1]+k,arr[n-1]-k);
                min = Math.min(arr[0]+k,arr[i]-k);
                result = Math.min(result,max-min);
            }
        }
        System.out.println(result);
    }
}