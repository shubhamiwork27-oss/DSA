import java.util.*;
public class StackRev {

//Push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s,int data){
     if(s.isEmpty()){
         s.push(data);
         return; 
     }
     int top = s.pop();
     pushAtBottom(s,data);
     s.push(top);
    }

    public static void RevStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        RevStack(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        RevStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

