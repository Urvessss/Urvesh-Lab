package Lab1;

import java.util.Scanner;

public class Exersize5 {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	int n=sc.nextInt();
	calculateSum(n);
		
	}
	public static  void calculateSum(int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=sum+i;
			}
		}
		System.out.println("the sum of first"+n+"Integer are divisible by 3&5="+sum);
	}

	
}

