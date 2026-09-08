public class FirstOcc {


    public static int firstocc(int arr[] ,int key ,int i) {
        //base case
        if(i == arr.length){    
            return -1;
        }
        if(arr[i] == key){
            return i ;
        }
        return firstocc(arr , key ,i+1);

    }

    public static void main(String[] args) {

        int arr[] = {1,2,9,4,5};
        System.out.println("First occurrence of key at index : "+firstocc(arr,5, 0));
    }
}
