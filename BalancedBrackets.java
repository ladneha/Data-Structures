import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

    static boolean checkBalance(String brackets){
        char[] expression = brackets.toCharArray();
        if(expression.length == 1){
            return false;
        }
        Stack<Character> stack = new Stack();
        for(char e : expression){
            if(e=='{'){
                stack.push('}');
            }else if(e=='['){
                stack.push(']');
            }else if(e=='('){
                stack.push(')');
            }else{
                if(stack.empty() || e!=stack.peek())
                   return false;
                stack.pop();
            }
            
        }
        return stack.empty();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       
        for (int tItr = 0; tItr < t; tItr++) {
            String expression = scanner.nextLine();
             boolean check = checkBalance(expression);
        if(check == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");   
        }
        }
       
        scanner.close();
    }
}
