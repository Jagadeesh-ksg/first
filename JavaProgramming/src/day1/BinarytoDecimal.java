package day1;

import java.util.Scanner;

public class BinarytoDecimal {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a binary number");
		int bin=scan.nextInt();
		int dec=0;int i=1;
		while(bin!=0)
		{
			int rem=bin%10;
			dec=dec+rem*i;
			i=i*2;
			bin=bin/10;
		}	
		System.out.println("decimal number is:"+dec);
		scan.close();
	}

}
