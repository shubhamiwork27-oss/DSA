public class Power{

    public static int calcpow(int n , int a) {
        if(n == 0){
            return 1;
        }

            int halfpowsq = calcpow(a,n/2);
            int halfpow = halfpowsq * halfpowsq;

            //if n is odd
            if(n % 2 !=0){
                halfpowsq = a * halfpowsq;
            }
        
        return halfpowsq;
    }

    public static void main(String[] args) {
        int n = 2;
        int a = 5;
        System.out.println(calcpow(n,a));
    }
}