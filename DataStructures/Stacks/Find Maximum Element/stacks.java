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
     int max = Integer.MIN_VALUE;
     Stack<StackNode> myStack = new Stack<StackNode>();
     while(n>0)
     { 
       int type = sc.nextInt();
       switch(type)
       {
         case 1: int element = sc.nextInt();
                 if(element>max)
                     max=element;
                 myStack.add(new StackNode(element,max));
                 break;
         case 2: if(!myStack.empty())
                     myStack.pop();
                 if(myStack.empty())
                     max=Integer.MIN_VALUE;
                 else
                     max=myStack.peek().max;
                 break;
         case 3: if(!myStack.empty())
                    System.out.println(myStack.peek().max);
                 break;
                 
       }
         --n;
     }
     sc.close();
    }
}

class StackNode
{
    int data;
    int max;
    
    public StackNode(int data,int max)
    {
        this.data = data;
        this.max = max;
    }
    
    public String toString()
    {
        return data+" "+max;
    }
}
