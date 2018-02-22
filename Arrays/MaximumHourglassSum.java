import java.io.*;
import java.util.*;

public class MaximumHourglassSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    int[][] m = new int[6][6];
    int resultSum = -99999;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                m[i][j]=sc.nextInt();
            }
        }
        
         for(int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
                sum = m[i][j]+m[i][j+1]+m[i][j+2]+m[i+1][j+1]+m[i+2][j]+m[i+2][j+1]+m[i+2][j+2];
                if(resultSum<sum){
                    resultSum = sum;
                }
            }
        }
        
        System.out.println(resultSum);
        
    }
}