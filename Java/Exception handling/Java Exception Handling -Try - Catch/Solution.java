import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */  Scanner sc = new Scanner(System.in);
    
    try{
        System.out.println((sc.nextInt()/sc.nextInt()));
        sc.close();
    }
    catch(InputMismatchException e)
    {
        System.out.println("java.util.InputMismatchException");
    }
    catch(ArithmeticException e)
    {
        System.out.println("java.lang.ArithmeticException: / by zero");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
