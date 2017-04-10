import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        //declare all variables
        int x,y,index,lastAns=0,type;
        // no of sequences
        int n=sc.nextInt();
        //no of queries
        int q=sc.nextInt();
        
        //declare the sequence List
        ArrayList<Integer>[] seqList = new ArrayList[n];
        
        //extract data and print lastAns based on condition
        while(q>=0)
            {
            type = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            
            index = (x^lastAns)%n;
            
            //switch on type of query selected
            switch(type)
                {
                case 1: if(seqList[index]==null)
                        {
                            ArrayList<Integer> myList = new ArrayList<Integer>();
                            myList.add(y);
                            seqList[index]=myList;
                        }
                        else
                        {
                            seqList[index].add(y);
                        }
                        break;
                
                case 2 : lastAns=seqList[index].get(y%(seqList[index].size()));
                         System.out.println(lastAns);
                         break;
                }
         --q;   
        }
            
            
    }
}
