import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote {

    // Complete the checkMagazine function below.
    static String checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
        for(String word: magazine){
            if(hashtable.containsKey(word)){
                hashtable.put(word, hashtable.get(word)+1);
            }else{
                hashtable.put(word, 1);
            }
        }
        
        for(String noteword: note){
            if(!hashtable.containsKey(noteword)){
                return "No";
            }
            int count = hashtable.get(noteword)-1;
            if(count==0){
                hashtable.remove(noteword);
            }else{
                hashtable.put(noteword, count);
            }
        }
        return "Yes";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        System.out.println(checkMagazine(magazine, note));

        scanner.close();
    }
}