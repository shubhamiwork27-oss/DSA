public class pattern2 {
    public static void pattern(int n) {
        int counter = 0 ;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                counter  = i + j;
                if(counter % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
