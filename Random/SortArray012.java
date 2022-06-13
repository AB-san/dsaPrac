public class SortArray012{
    public static void main (String[] args){
        int [] arr = {0,2,1,0,1,2,1};
        int zero =0, one =0, two =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else if(arr[i]==2){
                two++;
            }
        }
        for(int i=0; i<zero+one+two; i++){
            if(i<zero){
                System.out.print(0);
            }
            else if(i<zero+one){
                System.out.print(1);
            }
            else{
                System.out.print(2);
            }
        }
    }
}