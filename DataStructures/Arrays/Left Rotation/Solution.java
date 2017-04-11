import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        //take size of the array
        int n = sc.nextInt();
        //take no of shifts
        int d = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        //intialise array
        for(int i=0;i<arr.length;++i)
            arr[i]=sc.nextInt();
        
        //d left rotations = n-d right rotations
        for(int i=0;i<arr2.length;++i)
            arr2[(i+n-d)%n]=arr[i];
        
        //print the array
        for(int i=0;i<arr2.length;++i)
            System.out.print(arr2[i]+" ");
    }
}
