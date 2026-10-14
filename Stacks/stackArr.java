public class stackArr{


    //variables
    public int arr[] = new int[5];
    public int top = -1;
       
    //isEmpty
    public boolean isEmpty() {
        return top == -1;
    }
    //ifFull
    public boolean isFull() {
        return top == arr.length-1;
    }
    //push
    public void push(int data) {
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = data;
    }
    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }
    //peek
    public int peek() {
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }
    public static void main(String[] args){
        stackArr star = new stackArr();
        for (int i = 1; i <= 5; i++) {
            star.push(i);
        }
        for (int i = 0; i < star.arr.length; i++) {
            System.out.println(star.pop());
        }

    }
}