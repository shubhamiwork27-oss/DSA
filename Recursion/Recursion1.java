public class Recursion1{

    public static void countback(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        countback(n-1); 
    }
    public static void countforward(int n){
            if(n == 1){
            System.out.println(1);
            return;
        }
        countforward(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        countforward(n);
    }
}