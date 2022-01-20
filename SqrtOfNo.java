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
