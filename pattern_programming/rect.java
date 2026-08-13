public class rect{

    public static void hollow_rect(int rows , int cols){

        for(int  i = 1 ; i<=rows ; i++){
            for(int j = 1 ; j<=cols ; j++){
                if(i == 1 || rows == i || j == 1 || cols == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

       
    }

    public static void main(String[] args) {
        hollow_rect(10,30);
    }
}