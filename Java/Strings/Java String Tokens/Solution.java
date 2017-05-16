import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        
        if(s.length()==0)
        {
            System.out.println(0);
            return;
        }
        String delim = "[^A-Za-z]+";
        String[] strArray = s.split(delim);
        System.out.println(strArray.length);
        for(String temp:strArray)
            System.out.println(temp);
    }
    }


