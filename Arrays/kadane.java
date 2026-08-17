public class kadane {
    //Time complexity will be O(n)

    public static void kadanes(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int small = 0;


        for (int i = 0; i < arr.length; i++) { 
            cs = cs + arr[i];                 
            if(cs < 0){          
                cs = 0; 
            }
            ms = Math.max(cs, ms); 
        }
           if(cs == 0){
                for (int k = 0; k < arr.length; k++) {
                    if(arr[k] < 0){
                        small = arr[k];
                        if (small > arr[k]) {
                        }
                        System.out.println(small);
                    }
                }
        }
        

        System.out.println("The largest sum is : " + ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-4,-6,-8};
         kadanes(arr);
    }


}
