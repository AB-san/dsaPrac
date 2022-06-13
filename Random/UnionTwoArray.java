public class UnionTwoArray {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3};
        int m = a.length;
        int n = b.length;
        int i =0, j=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                System.out.print(a[i++] + " ");
            }else if(a[i]>b[j]){
                System.out.print(b[j++] + " ");
            }else if(a[i] == b[j]){
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while(i<m){
            System.out.print(a[i++] + " ");
        }
        while(j<n){
            System.out.print(b[j++] + " ");
        }

    }
}
