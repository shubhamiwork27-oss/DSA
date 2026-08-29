public class Diagonal{

    //BRUTEFORCE APPROACH
    // public static int DiagonalArrays1(int arr[][]){
    //     int m = arr.length;
    //     int n = arr[0].length;
    //     int sum = 0;
    //         for (int i = 0; i < m; i++) {
    //             for (int j = 0; j < n; j++) {
    //                 if(i == j){
    //                     sum += arr[i][j];
    //                 }else if (i+j == m-1){
    //                     sum += arr[i][j];
    //                 }
    //             }
    //         }
    //         return sum;
    // }

    //BEST APPROACH//
    public static int DiagonalArrays(int arr[][]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //pd
            sum += arr[i][i];
            //sd
            if(i != arr.length-1-i){
            sum += arr[i][arr.length-i-1];
            }

        }

        return sum ;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        // int i= arr.length-1;
                        // System.out.println(arr[i][i]);
        // System.out.println(DiagonalArrays1(arr));
        System.out.println(DiagonalArrays(arr));

    }
}