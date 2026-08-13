public class butterfly{
    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 2nd half
               for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    //optimized

    public static void patternopt(int n) {
        StringBuilder sb = new StringBuilder(); //for creating string//
        for (int i = 1; i <= n; i++) appendRow(sb, i, n);
        for (int i = n; i >= 1; i--) appendRow(sb, i, n);
        System.out.print(sb);
    }

    public static void appendRow(StringBuilder sb, int i, int n) {
        String stars = "* ".repeat(i);
        sb.append(stars).append("  ".repeat(2 * (n - i))).append(stars).append('\n');
    }

    public static void main(String[] args) {
        int n = 7;
        pattern(n);
        patternopt(n);
    }
}





