import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;++i)
            {
            for(int j=0;j<arr.length;++j)
                {
                if(i==0 || i==5 || j==0 || j==5)
                    continue;
                else
                    {
                    sum=arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                    if(sum>max)
                        max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
