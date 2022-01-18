import java.util.Arrays;

public class MinimizeMaxDiffHeights {
    public static void main(String[] args){
        int[] arr = {5,5,8,6,4,10,3,8,9,10};
        Arrays.sort(arr);
        int n =arr.length;
        int k =5;
        int min = 0,max =0;
        int result = Integer.MAX_VALUE;
        for(int i = 1;i<n;i++){
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k,arr[i]-k);
            int diff = max-min;
            if(diff<result){
                result = diff;
            }
        }
        System.out.println(result);
    }
}