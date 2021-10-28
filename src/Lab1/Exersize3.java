package Lab1;

import java.util.Scanner;

public class Exersize3 {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
      int a=1,b=1,c=0;
  System.out.println("Enter the value of n");
  int n=sc.nextInt();
     System.out.println(a);
     System.out.println(" "+b);
    for(int i=0;i<n-2;i++)
{
	
   c=a+b;
  a=b;
  b=c;
  System.out.println(" "+c);

}
System.out.println();
System.out.print(n+":last:"+c);
	}

}
