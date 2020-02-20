package com.calci;
import java.util.*;
class add
{
	int a,b;
	add(int one,int two)
	{
		a=one;
		b=two;
	}
	long sum()
	{
		return a+b;
	}
}

class sub
{
	int a,b;
	sub(int one,int two)
	{
		a=one;
		b=two;
	}
	int diff(int a,int b)
	{
			return a-b;
	}
}
class mul
{
	int a,b;
	mul(int one,int two)
	{
		a=one;
		b=two;
	}
	long prod(int a,int b)
	{
		return a*b;
	}
}
class div
{
	float a,b;
	div(float one,float two)
	{
		a=one;
		b=two;
	}
	boolean quo(float a,float b)
	{
	if(b!=0)
		{
		System.out.println(a/b);
		return true;
		}
	else 
		{
		System.out.println("Invalid operation");
		return false;
		}
	}
}
public class calculator {
		public static void main(String z[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 numbers on whcih operations are to be performed");
			int one=sc.nextInt();
			int two=sc.nextInt();
			System.out.println("Select an operation from the following :");
			System.out.println("1.Add(+)   2.Divide(/)  3.Multiply(*)   4.Subtract(-)");
			int key=sc.nextInt();
			switch(key)
			{
			case 1:
				add a=new add(one,two);
				System.out.println("The sum of above 2 numbers is :" +a.sum());
				break;
			
			case 2:
				div d=new div(one,two);
				System.out.println("The status of above operation is as :" + d.quo(one,two));
				break;
				
			case 3: 
				mul m=new mul(one,two);
				System.out.println("The product of above 2 numbers is :"+m.prod(one,two));
				break;
				
			case 4:
				sub s=new sub(one,two);
				System.out.println("The difference of above 2 numbers is :"+s.diff(one,two));
				break;
			}
		}
	}


