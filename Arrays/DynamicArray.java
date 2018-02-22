import java.io.*;
import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, q;
        int lastAnswer = 0;
        int query, x, y, seq;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        List[] seqList = new List[n];
        for(int i=0; i<n; i++){
            seqList[i] = new ArrayList<Integer>();
        }
        
        for(int i=0; i<q; i++){
            query = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
           // System.out.println(query+" "+x+" "+y);
            List<Integer> sequence = seqList[(x^lastAnswer)%n];
            switch(query){
                case 1:
                    
                    sequence.add(y);
                    break;
                case 2:
                   
                    lastAnswer = sequence.get(y%sequence.size());
                    System.out.println(lastAnswer);
                    break;
            }
        }
    }
}