import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int k = sc.nextInt();
    SortedSet<String> mySet = new TreeSet<>();
    for(int i=0;i<=str.length()-k;++i)
        mySet.add(str.substring(i,i+k));
    System.out.println(mySet.first());
    System.out.println(mySet.last());
    }
}
