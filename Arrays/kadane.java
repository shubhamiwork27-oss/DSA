public class kadane {
    //Time complexity will be O(n)

    public static void kadanes(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int small = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) { 
            cs = cs + arr[i];                 
            if(cs < 0){          
                cs = 0; 
            }
            ms = Math.max(cs, ms); 
        }
        

           if(cs == 0){
             for (int num : arr) {
                if(num < 0 && num > small){
                     small = num;
                 }
             }
             System.out.println("The largest sum number is : " + small);
          }else{
             System.out.println("The largest sum number is : " + ms);
          }
        

    }
    public static void main(String[] args) {
        int arr[] = {-1,-4,-6,-8,-9};
         kadanes(arr);
    }


}
