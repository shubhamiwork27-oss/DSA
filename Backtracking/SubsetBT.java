public class SubsetBT {
    public static void changeSubset(String str , String ans , int i) {
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
            System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
       
        //recursion
        //yes
        changeSubset(str, ans+str.charAt(i), i+1);
        //no
        changeSubset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        SubsetBT sb = new SubsetBT();
        sb.changeSubset(str,"", 0);
    }
}
