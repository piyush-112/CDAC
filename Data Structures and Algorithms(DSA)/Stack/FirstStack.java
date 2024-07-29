import java.util.ArrayList;

public class FirstStack {
   static class Stack{
    //creation of the Stack
    static ArrayList<Integer> list =new ArrayList<>();
    public static boolean isEmpty() {
        return list.size() == 0;
    }
    //push operation
    public static void push(int data){
        list.add(data);
    }
    //pop
    public static int pop(){
        if(isEmpty()){   //for charcking the Array Empty or not
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //peek
    public static int peek(){
        if(isEmpty()){   //for charcking the Array Empty or not3
            return -1;
        }
        return list.get(list.size()-1);
    }
   } 
   public static void main(String[] args) {
       Stack s=new Stack();
       s.push(1);
       s.push(2);
       s.push(3);

       while(!s.isEmpty()){
        System.err.println(s.peek());
        s.pop();
       }
   }
}
