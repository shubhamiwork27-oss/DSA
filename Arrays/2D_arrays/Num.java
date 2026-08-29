public class Num {
    public static int Total(int arr[][] ,int key) {
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(key == arr[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{7,7,6},{1,1,1}};
        int key = 7;
        int ans = Total(arr , key);
        System.out.println("Total :" + ans);
    }
}
