public class Binarysearch{

    public static int Searchit(int arr[],int target) {
        int start = 0 , end = arr.length-1;
        while(start<= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {    
        int arr[] = {2,3,4,5,6,7,8};
        int target = 7;
        System.out.println("Target is at :" + Searchit(arr, target));
    }
}