public class Sum {
     public static int add(int n) {

        if(n==0){
            return 0;
        }

        int fnm1 = add(n-1) ;
        int fn  = n + fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(add(n));
    }
}
