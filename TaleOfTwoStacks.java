import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaleOfTwoStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.add(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.remove();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue{
    Stack<Integer> stackNewest;
    Stack<Integer> stackOldest;
    
    public MyQueue(){
        stackNewest = new Stack<Integer>();
        stackOldest = new Stack<Integer>();
    }
    
    public int size(){
        return stackNewest.size()+stackOldest.size();
    }
    
    public void add(int value){
        stackNewest.push(value);
    }
    
    private void shiftStack(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                 stackOldest.push(stackNewest.pop());
            }
        }
    }
    public int peek(){
        shiftStack();
        return stackOldest.peek();
    }
    
    public int remove(){
        shiftStack();
        return stackOldest.pop();
    }
}