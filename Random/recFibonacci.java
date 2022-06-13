//WAP to print n-th fibonacci no. indexn starts from 0
//using tail recursive

public class recFibonacci {
    public static void main(String[] args) {
        int x = fib(1,0,1);
        System.out.println(x);
    }
    static int fib(int n,int a, int b){
        if(n==0)return 0;
        if(n==1)return b;
        return fib(n-1, b, a+b);
    }
}
