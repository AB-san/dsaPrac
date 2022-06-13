public class MoveAllNeg {
    public static void main(String[] args){
        int c =0;
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                if(i!=c){
                    int temp = arr[i];
                    arr[i] = arr[c];
                    arr[c] = temp;
                }
                c++;
            }
        }
        for(int i =0;i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
