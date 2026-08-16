public class linear {

    // public static int linear(int arr[] , int target){
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] == target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
        
    public static int Linearstr(String strarr[] , String strtarget){
        for (int i = 0; i <= strarr.length; i++) {
            if(strarr[i].equals(strtarget)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = {3,1,4,2,6,5};

        String strarr[] = {"Dosa" , "Samosa" , "Idli" , "Oats"};
        String strtarget = "Dosa";
         
        // int target = 6;
        // int ans = linear(arr , target);
        int strans = Linearstr(strarr,strtarget);

        // if(ans == -1){
        //     System.out.println("NOT Found");
        // }else{
        //     System.out.println("Found at index: " + ans);
        // }

        if(strans == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index: " + strans);
        }
    }
    
}
