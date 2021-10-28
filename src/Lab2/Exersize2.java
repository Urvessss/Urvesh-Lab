package Lab2;

import java.util.TreeSet;

public class Exersize2 {

	public static String[] getSort(TreeSet<String> arr) {
		
		int n = arr.size();
		String []str= new String[n];
		str = arr.toArray(str);
		
		if(n%2 == 0)
		{
			for(int i=0;i<(n/2); i++)
				str[i] = str[i].toUpperCase();
			for(int i=(n/2); i<n; i++)
				str[i] = str[i].toLowerCase();
		}
		else
		{
			for(int i=0;i<(n/2)+1; i++)
				str[i] = str[i].toUpperCase();
			for(int i=(n/2 + 1); i<n; i++)
				str[i] = str[i].toLowerCase();
		}
		
		return str;
	}

	public static void main(String[] args) {
		
		TreeSet<String> str = new TreeSet<>();
		str.add("Hello");
		str.add("Welcome");
		str.add("tO");
		str.add("the");
		str.add("Capgemini");
		
		
		
//	Object[] arr = str.toArray(); 
	//acceptSort(arr);
		String arr_result[] = getSort(str);
		
		for(String i: arr_result)
			System.out.print(i+ "  ");	
	}
}
