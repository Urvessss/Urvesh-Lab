package Lab1;

import java.util.Scanner;

public class Exersize1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		System.out.println("The sum of cube:"+sum);
	}

}

