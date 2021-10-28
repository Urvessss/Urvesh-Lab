package Lab1;

import java.util.Scanner;

public class Exersize4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			int temp=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					temp=1;
			}
			if(temp==0)
			{
				System.out.println(i);
			}
		}
	}

}
