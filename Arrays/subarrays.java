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
        for (int i = 0; i < arr.length; i++) {
            int one = i;
            for (int j = one; j < arr.length; j++) {
                int two = j;
                for (int k = one; k <= two; k++) {
                    System.out.print(arr[k]+" ");
                    int add = 0;
                    for (int z = one; z < two; z++) {

                    }
                  }
                  System.out.println();
                }
                System.out.println();
            }

    }






    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9};
        // subarray(arr);
         subarrayadd(arr);
    }

}
