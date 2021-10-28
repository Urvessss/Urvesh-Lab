package Lab3;

import java.util.Scanner;

public class Exercise2 {
	public String getImage(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.append('|');
		StringBuffer sb1 = new StringBuffer(s);
		sb1.reverse();
		sb.append(sb1);
		return sb.toString();
	}

	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String sb = sc.next();
		System.out.println(e2.getImage(sb));

	}
}
