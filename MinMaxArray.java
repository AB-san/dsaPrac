public class MinMaxArray {
    public static void main(String[] args) {
        int[]  arr = {100,99,87,9,400,432,788};
        int min = arr[0];
        int max = arr[1];
        for(int i =2; i< arr.length; i++){
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]> max)
                max = arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
