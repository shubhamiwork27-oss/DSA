
public class main {

    public static void main(String[] args) {
        int n =5 ; 

        // half pyramid printing
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // upside down pyramid printing
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


        // code for numerical pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // code for upside down numerical pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // pattern programming
        for (int star = 1; star <= n; star++) {
            for (int line = 1; line <= star; line++) {
                System.out.print("*");
            }
            System.out.println();
        }


                // code for numerical pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


      

    }
}