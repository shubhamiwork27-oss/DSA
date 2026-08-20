public class nearestneg {
    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,-5};
        int small = Integer.MIN_VALUE ;

        for (int num : arr) {
            if(num < 0 && num > small){
                small = num;
            }
        }
    System.out.println(small);

    }
}
