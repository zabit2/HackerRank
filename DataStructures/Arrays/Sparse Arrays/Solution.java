import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//take n value
		int n = sc.nextInt();
		//clear buffer while changing type of variable from integer to string
		sc.nextLine();
		//map to store string and occurrences
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		String inputString;
		Integer count;
		for(int i=0;i<n;++i)
		{
			inputString = sc.nextLine();
			count = myMap.get(inputString);
			if(count==null)
			{
				count = 0;
			}
			++count;
			myMap.put(inputString,count);
		}
		
		
		int q = sc.nextInt();
		//clear buffer while changing type of variable from integer to string
		sc.nextLine();
		String queryString;
		for(int i=0;i<q;++i)
		{
			queryString = sc.nextLine();
			count = myMap.get(queryString);
			if(count==null)
			{
				count = 0;
			}
			System.out.println(count);
		}
	    sc.close();
	}
}
