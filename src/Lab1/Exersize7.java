package Lab1;

import java.util.Scanner;

public class Exersize7 {
	public static void main(String[] args) {
		
		boolean increasingNumber=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		increasingNumber=checkNumber(number);
		System.out.println(increasingNumber);
	}
	public static boolean checkNumber(int number)
	{
		boolean increasing =false;
		 while(number>0) {
	            int last= number % 10;
	            number /= 10;
	            int nextLast = number % 10;
	            
	            if(nextLast<=last) {
	                increasing=true;
	            }
	            else {
	                increasing=false;
	                break;
	            }
	            
	        }
	        return increasing;
	}

}
