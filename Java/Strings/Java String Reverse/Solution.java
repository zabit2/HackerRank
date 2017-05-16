import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] Adup = A.toCharArray();
        /* Enter your code here. Print output to STDOUT. */
        char temp;
        for(int i=0,j=Adup.length-1;(i<Adup.length/2)&&j>=0;++i,--j)
        {
            temp = Adup[i];
            Adup[i]=Adup[j];
            Adup[j]=temp;
        }
        String newStr = "";
        for(char c:Adup)
            newStr+=c;
            
        if(A.compareTo(newStr)==0)
            System.out.println("Yes");
        else
            System.out.println("No");
            
    }
}

