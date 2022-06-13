public class MoveAllNeg1 {
    public static void main(String[] args){
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int left =0,right = arr.length-1;
        
            while(left <= right){
                if(arr[left]<0 && arr[right]<0)
                    left++;
                else if(arr[left]>0 && arr[right]>0)
                    right--;
                else if(arr[left]<0 && arr[right]>0){
                    left++;
                    right--;
                }
                else if(arr[left]>0 && arr[right]<0){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
