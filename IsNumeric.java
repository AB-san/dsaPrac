public class IsNumeric {
    public static void main(String[] args) {
        String x = "-123.78";
        System.out.println(isNumeric(x));
    }
    static boolean isNumeric(String s){
        int l = s.length();
        for(int i = 0;i<l;i++){
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9')|| s.charAt(i) == '-' || s.charAt(i)=='.') {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
