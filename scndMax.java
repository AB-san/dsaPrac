public class scndMax {
    static int secondMax(int[] arr){
        int l = arr.length;
        int max = Integer.MIN_VALUE, secMax = 0;
        for(int i=0;i<l;i++){
            if(arr[i] > max ){
                secMax = max;
                max =arr[i];
            }else if(arr[i]>secMax){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int a[] = {5,6,8,3,9,5,1,0,4};
        System.out.println(secondMax(a));
    }
}
