public class DiagonalSearch {

    public static boolean NumSearch(int arr[][], int key) {
         int row = 0;
         int column = arr[0].length-1;
         while(row<arr.length && column >= 0){
            if (arr[row][column] == key) {
                System.out.println("Element found at index : ("+row +","+column+")");
                return true;
            }else if(key < arr[row][column]){
                column--;
            }else{
                row++;
            }
         }
         System.out.println("NOT FOUND !");
        return false;
    }

    public static void main(String[] args) {        
        int arr[][] = {{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {33,1,99,77}};
        int key = 33;
        NumSearch(arr,key);
    }
}
