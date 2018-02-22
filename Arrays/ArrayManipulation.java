import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] list = new int[n+1];
        for(int i=0; i<n; i++){
            list[i] = 0;
        }
        while(m-- >0){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
           
                list[a-1]=list[a-1]+k;
                list[b] -=k;
               
        }
        long max = 0;
        long sum = 0;
        for(int i=0; i<n; i++){
           sum += list[i];
           max = Math.max(max, sum);
        }
        System.out.println(max);
        in.close();
    }
}