package practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class java {
 public static void main(String args[])
 {
	 System.out.println("1.B 2.B 3.D 4.B 5.D ");
	 Scanner in=new Scanner(System.in);
	 Monkey a=new Monkey("doinb");
	 people b=new people("Tian");
	 a.speak();
	 b.speak();
	 b.think();
	 System.out.println(a.name);
	 System.out.println(b.name);
	 Car c=new Car(4,1000,6);
	 Truck d=new Truck(8,2000,3,6000);
	 c.test();
	 d.test();
	 String m=getSum("98123718293","12231242131");
	 System.out.println(m);	 
	 String[] s=new String[]{"f1ower","f1ow","f1ight"};
	    Solution so=new Solution();
	    String s1=so.longestCommonPrefix(s);
	    System.out.println(s1);
}
 
 
 public static class Vehicle
 {
	 int wheels;
	 int weight;
	 public Vehicle(int a, int b)
	 {   
		 wheels=a;
		 weight=b;
	 }
 }
 public static class Car extends Vehicle
 {int loader;
 
 public Car(int a,int b,int c)
 {    super(a,b);
	  loader=c;
	
 }
 public void test()
 {
	 if(loader>=6)
	 {    
		 System.out.println("���ֵĸ�����"+this.wheels+"  ���أ�"+this.weight);
		 System.out.println("����һ��С��������6�ˣ�ʵ��"+loader+"�ˣ��㳬��Ա��");
		 
	 }
	 else
	 {
		 System.out.println("���ֵĸ�����"+this.wheels+"  ���أ�"+this.weight);
	 }
 }
 }

 public static class Truck extends Vehicle
 {int loader;
 int payload;
 public Truck(int a,int b,int c,int d)
 {
	 super(a,b);
	 loader=c;
	 payload=d;
 }
 public void test()
 {
	 if(loader>=3&&payload<5000)
	 {
		 System.out.println("���ֵĸ�����"+this.wheels+"  ���أ�"+this.weight);
		 System.out.println("����һ������������3�ˣ�ʵ��"+this.loader+"�ˣ��㳬Ա��");
		 System.out.println("����һ������,����5000kg������װ��"+payload+"kg");
	 }
	 else if(payload>5000&&loader<3)
	 {
		 System.out.println("���ֵĸ�����"+this.wheels+"  ���أ�"+this.weight);
		 System.out.println("����һ������������3�ˣ�ʵ��"+this.loader+"��");
		 System.out.println("����һ������,����5000kg������װ��"+payload+"kg���㳬����");
	 }
	 else if(payload>5000&&loader>=3)
	 {
		 System.out.println("���ֵĸ�����"+this.wheels+"  ���أ�"+this.weight);
		 System.out.println("����һ������������3�ˣ�ʵ��"+this.loader+"��,�㳬Ա��");
		 System.out.println("����һ������,����5000kg������װ��"+payload+"kg���㳬����");
	 }
	 else
	 {
		 System.out.println("���ֵĸ�����"+this.wheels+"  ���أ�"+this.weight);
		 System.out.println("����һ������������3�ˣ�ʵ��"+this.loader+"��");
		 System.out.println("����һ������,����5000kg������װ��"+payload+"kg");
	 }
 }
 }

public static class Monkey
{
	String name;
	public Monkey(String s)
	{
		name=s;
	}
	public void speak()
	{
		System.out.println("����ѽѽ ......  ");
	}
}

public static class people extends Monkey
{   
	public people(String s)
	{
		super(s);
	}
	public void speak()
	{
		System.out.println("С�������������˵���ˣ�" );
	}
	public void think()
	{
		System.out.println("��˵��������˼����");
	}
}
public static String getSum(String a, String b) 
{
    int aIndex = 1;
    int bIndex = 1;
    int flag = 0;
    String res = "";
    while (aIndex <= a.length() || bIndex <= b.length() || flag > 0) {
    
        int aNum = aIndex <= a.length() ? a.charAt(a.length() - aIndex) - '0' : 0;
        int bNum = bIndex <= b.length() ? b.charAt(b.length() - bIndex) - '0' : 0;
      
        res = (aNum + bNum + flag) % 10 + res;
        
        flag = (aNum + bNum + flag) / 10;
        aIndex++;
        bIndex++;
    }
    return res;
}

}
class Solution{
    public String longestCommonPrefix(String[] strs ){

        String s="";
        int start=0;
        char temp;
        if(strs.length==0)
            return "";
        char[][]a=new char[strs.length][];
        for(int i=0;i<a.length;i++){ 
           a[i]=new char[strs[i].length()];

        }

        start=a[0].length;
        for(int i=0;i<a.length;i++){
            char[]b=new char[strs[i].length()];
            b=strs[i].toCharArray();
            if(start>strs[i].length())
                start=strs[i].length();
            for(int j=0;j<a[i].length;j++){
                a[i][j]=b[j];
            }
        }

       a: for(int i=0;i<start;i++){
            char b=a[0][i];
            int falg=1;
            for(int j=1; j<a.length;j++){
                if(b!=a[j][i]) {
                    falg = 0;
                    if(falg==0&&i==0)
                    break a;
                }
            }
            if(falg==1)
                s+=b;

        }

        return s;

      

    }

}



