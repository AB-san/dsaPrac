public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123456";
        String num2 = "654321";
            int l = num2.length();
            double n = Double.parseDouble(num1);
            double res =0;
            for(int i = 0; i<l; i++){
                double t1 = Double.parseDouble(String.valueOf(num2.charAt(l-1-i)));
                int t2 = (int)Math.pow(10,i);
                res += n * t1 * t2;
            }
            System.out.println(String.valueOf(res));
    }
}
