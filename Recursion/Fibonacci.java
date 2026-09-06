public class Fibonacci {


    public static int Fibon(int n){

        //Base Case
        if(n ==0 || n == 1){
            return n ;
        }
        int fib1 = Fibon(n-1);
        int fib2 = Fibon(n-2);
        int fn = fib1+ fib2 ;
        return fn;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(Fibon(n));
    }
}
