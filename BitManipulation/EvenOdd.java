package BitManipulation;

public class EvenOdd {

    public static void check(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.print("Even number :" + n);
        }else{
            System.out.print("Odd number :" + n);
        }
    }

    public static void main(String[] args) {
        check(3);
        check(5);
        check(4);

    }
}
