// public class main {
//     //basic functon in java
//     // public static void basics(){
//     //     System.out.println("helllo");
//     // }
//     public static void addtonum(int num1 ,int num2) {
//         int add = num1 +num2;
//         System.out.println(add);
//     }
//     public static void main(String[] args) {
//         // basics();
//         // output-> hello
//         int a = 10;
//         int b = 20;
//         addtonum(a,b);
//     }
// }


public class main {

    public static int factorial(int n) {
        int f = 1 ;

        for(int i = 1 ; i <= n; i++ ){
            f = f * i;
        }
        return f;
    }

 public static void main(String[] args) {
    System.out.print(factorial(5));
 }   
}