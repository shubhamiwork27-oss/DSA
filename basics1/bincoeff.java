public class bincoeff {
    public static void factorial(int n) {
        int f =1 ;
        for(int i = 1 ; i <= n ; i++){
            f = f * i;
        }
        System.out.print(f);
    }
    public static void main(String[] args) {
        int n = 5;
        factorial(n);
    }
}
