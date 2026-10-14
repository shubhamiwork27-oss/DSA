public class SubsetPC {

    public static void subset(String str,String ans) {
        //base Case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //"abc" = "abc" , "bca" , "cab" , "bac" , "acb" , "cba"
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0 , i) + str.substring(i+1);
            subset(newStr,curr+ans);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        SubsetPC pc = new SubsetPC();
        pc.subset(str , "");
    }
}
