public class subarrays {

    public static void subarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
                System.out.println();
        }
    }

    public static void subarrayadd(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                          sum += arr[k];
                  }
                  System.out.print(sum+" ");
                  if(max < sum){
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("maximum value from the array operation is : " + max);

    }






    public static void main(String[] args) {
        int arr[] = {2,4,6,-8,9};
        // subarray(arr);
         subarrayadd(arr);
    }

}
