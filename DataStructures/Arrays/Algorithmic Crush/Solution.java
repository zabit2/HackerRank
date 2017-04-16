import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     
     long[] arr = new long[n+1];
     
        
     int index1=0;
     int index2=0;
     long value=0;
     while(m>0)
     {
         sc.nextLine();
         index1=sc.nextInt();
         index2=sc.nextInt();
         value = sc.nextInt();
         arr[index1-1]+=value;
         if((index2-1)<=n)
         arr[index2]-=value;
         --m;
     }
        
     long max=arr[0];
     for(int i=1;i<n;++i)
     {
         
         arr[i]+=arr[i-1];
         if(arr[i]>max)
             max=arr[i];
     }
     System.out.println(max);
     
    }
}
