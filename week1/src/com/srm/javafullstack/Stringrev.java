package com.srm.javafullstack;

import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string..");
		String s=sc.nextLine();
		String rev="";
		char[] ch=s.toCharArray();
		if(s.length()<=0)
		{
			System.out.println("Enter a valid string...");
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				rev=rev+ch[s.length()-i-1];
			}
		System.out.println("The reversed String is ..."+rev);
     }  
	}
}
