public class recSumOfDigits {
    int s=0;
    public static void main(String[] args) {
        System.out.println(sum(35983,0));
    }
    static int sum(int n,int s){
        if(n==0)return s;
        return sum(n/10,s+(n%10));
    }
}
