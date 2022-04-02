package Matrix;

public class SpiralPrint {
    public static void main(String[] args) {
        int k =0,l=0;
        int m = 3,n=5;
        int[][] arr = {{6,6,2,28,2},{12,26,3,28,7},{22,25,3,4,23}};

        while(k<m && l<n){
        for(int i=l;i<n;i++)System.out.print(arr[k][i]);

        for(int i=k+1;i<m;i++)System.out.print(arr[i][n-1]);

        for(int i=n-2;i>l-1;i--)System.out.print(arr[m-1][i]);

        for(int i=m-2;i>k;i--)System.out.print(arr[i][l]);

        k++;n--;m--;l++;
        }
    }
}
