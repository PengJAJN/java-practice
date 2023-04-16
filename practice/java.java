package practice;
import java.util.Scanner;
public class java {
 public static void main(String args[])
 {
	 System.out.println("1.B 2.B 3.D 4.B 5.D ");
	 Scanner in=new Scanner(System.in);
	 int n;
	 n= in.nextInt();
	 showTriangle(n);
	 String s="polarbear";
	 reverseString(s);
	 int num;
	 num=in.nextInt();
	 isPalindrome(num);
	 ShuiXianHua();
	 arraysDemo();
}
 static void showTriangle(int n)
 {int i=0;
 int j=1;
 int a;
 int num=n;
 while(i<=n-1)
 {  for(a=0;a<num;a++)
 {
	 System.out.print(" ");
 }
	for(a=0;a<j;a++)
	{   
		System.out.print("*");
		
	}
	num--;
	System.out.println("\n");
	j=j+2;
	i++;
 }
 }
	 
 
static void reverseString(String s) 
{
	char[] chars = s .toCharArray();
	char[] a=new char[chars.length];
	int i;
	for(i=0;i<chars.length;i++)
	{
		a[i]=chars[chars.length-1-i];
	}
	String s1 = String.valueOf(a);
	System.out.println(a) ;
}
static void isPalindrome(int num) 
{
	boolean flag = false;
    int a=1;
    int i=0;
    int num1=num;
    int num3=num;
    int num2=0;
    while(num1>10)
    {
    	num1=num1/10;
    	a++;
    }
    int b[]=new int[a];
    while(num>1)
    {   
    	
       
    	b[i]=num%10;
    	num=num/10;
    	i++;
    }
    i=a-1;
    while(i>=0)
    {   if(b[i]==0)
    {
    	num2=num2+1;
    }
    	num2=(int) (num2+b[i]*Math.pow(10,a-1-i));
    	System.out.println(num2);
    	i--;
    }
    System.out.println(num2);
    if(num2==num3)
    {flag= true;
    }
	if (flag) {
	System.out.println("yes") ; } else
	System.out.println("no") ; 
 
	

}
static void ShuiXianHua() 
{   for(int i=100;i<=999;i++)
{
	int a=i%10;
	int b=(i/10)%10;
	int c=(i/100);
	if(i==a*a*a+b*b*b+c*c*c)
	{
		System.out.println(i);
	}
}
}
static void arraysDemo() 
{
	int a[]= {31,34,54,73,26,27,24,75,51,66,};
	int i;
	int min=a[0];
	int max=a[0];
	for(i=0;i<a.length;i++){
		if(a[i]<min)
		{
			min=a[i];
		}
		
		}
	for(i=0;i<a.length;i++){
		if(a[i]>min)
		{
			max=a[i];
		}
		
		}
	System.out.println(max+min);
	}
	
	

}
