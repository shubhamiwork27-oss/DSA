import java.util.*;

public class StackRevStr {
    public static String RevStr(Stack<Character> s , String str){
        int idx = 0;
        while(idx < str.length()-1){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "HelloWorld";
        Stack<Character> s = new Stack<>();
        String result = RevStr(s , str);
        System.out.print(result);
    }
}