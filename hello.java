import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 3;
        while(t-- !=0){
            String s = sc.nextLine();
            int n = sc.nextInt();
            
            //sc.next();
            int n1 = sc.nextInt();
            sc.nextLine();
            System.out.println(n+" "+s +" "+n1);
        }
        sc.close();
    }
}
