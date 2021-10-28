package Lab1;

import java.util.Scanner;

public class Exersize6 {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(calculateDifference(n));
}

public static int calculateDifference(int n)
{
	int square=(n*(n+1)*(2*n+1))/6;
	int sum=(n*(n+1)/2);
	int squareSum=sum*sum;
	return squareSum;
	}
}
