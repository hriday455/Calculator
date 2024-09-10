package Calculatoruse;

import java.util.Scanner;

import Addition.Addition1;

public class Calculimp {
	public static void main(String[] args){
		System.out.println("Welcome");
		System.out.println("enter 1 for add");
		System.out.println("enter 2 for sub");
		Scanner sc=new Scanner(System.in);
		int opt =sc.nextInt();
		
		switch(opt)
		{
		case 1:{
			System.out.println("Enter 1 for adding 2 number");
			System.out.println("Enter 2 for adding 3 number");
			int opt1=sc.nextInt();
			switch(opt1) {
			case 1:{
				System.out.println("Enter the 1st number");
				int a=sc.nextInt();
				System.out.println("Enter the 2st number");
				int b=sc.nextInt();
				Addition1.add(a, b);
			}
			break;
			}
		}
		
		}
	}
}
