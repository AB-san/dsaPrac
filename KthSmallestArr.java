import java.util.Arrays;
public class KthSmallestArr {
    public static void main ( String[] args){
        int[] arr = {3,9,4,10,7,21};
        int k =2;
        Arrays.sort(arr);
        System.out.println(arr[k]);
    }
}
