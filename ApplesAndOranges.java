public class ApplesAndOranges {
    public static void main(String[] args){
        int r1=0,r2=0;
        int s = 7, t = 11;
        int a = 5, b= 15;
        //int m =3, n=2;
        int[] apples = {-2,2,1};
        int[] oranges = {5,-6};
    for(int i = 0; i<apples.length; i++){
        apples[i] += a;
        if(apples[i]>=s && apples[i]<=t){
            r1++;
        }
    }
    for(int j = 0; j<oranges.length; j++){
        oranges[j] += b;
        if(oranges[j] >=s && oranges[j] <=t){
            r2++;
        }
    }
    System.out.println(r1);
    System.out.println(r2);

    }
}
