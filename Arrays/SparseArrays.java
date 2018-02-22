import java.io.*;
import java.util.*;

public class SparseArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numberOfStrings = sc.nextInt();
        String[] strings = new String[numberOfStrings];
        for(int i=0; i<numberOfStrings; i++){
            strings[i] = sc.next();
           
        }
        
        int nquery = sc.nextInt();
        for(int i=0; i<nquery; i++){
            int count = 0;
            String query = sc.next();
            for(int j=0; j<numberOfStrings; j++){
                if(query.equals(strings[j])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}