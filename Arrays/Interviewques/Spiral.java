//Interveiw question on 2D ARRAYS such that the array should be printed in a spiral manner
public class Spiral {

    public static void SpiralMatrix(int arr[][]){ 
        int startRow = 0 ;
        int startColumn = 0;
        int endRow = arr.length - 1;
        int endColumn = arr[0].length - 1;
        
        // System.out.print(startRow + "," + endRow + "," + startColumn +"," + endColumn +",");

        while (startRow <= endRow && startColumn <= endColumn ) { 

        //top column
        for (int i = startColumn; i <= endColumn; i++) {
            System.out.print(arr[startRow][i]+" ");
        }

        System.out.println();

        //right end row
        for (int i = startRow+1; i <= endRow; i++) {
            System.out.print(arr[i][endColumn]+" ");
        }        

        System.out.println();

        //bottom column
        for (int i = endColumn-1; i >= startColumn; i--) {
            if(startRow == endRow){
                break;
            }
            System.out.print(arr[endRow][i]+" ");
        }          
        System.out.println();   

        //left row opposite traversed
        for (int i = endRow-1; i >= startRow+1; i--) {
            if(startColumn == endColumn){
                break;
            }
            System.out.print(arr[i][startColumn]+" ");
        }

        System.out.println();
        startRow++;
        startColumn++;
        endRow--;
        endColumn--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}};
        System.out.println("Real matrix : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");
        System.out.println("Spiral Matrix : ");
        SpiralMatrix(arr);

    }
}
