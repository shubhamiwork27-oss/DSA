public class Qone {
    public static void Total(int arr[][]){
        int add=0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                add += arr[i][j];
            }
        }
        System.out.println(add);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{10,15,20},{7,8,9}};
        Total(arr);
    }
}
