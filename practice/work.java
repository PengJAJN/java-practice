package practice1;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.*;
public class work {
 public static void main(String args[])
 {    Scanner in=new Scanner(System.in); 
 HashMap<Integer,student> hashstu=new HashMap<>();
String code="426813";
 while(true)
 {  
	 printmenu();
	 int a=in.nextInt();
	 switch(a)
	 {
	 case 1:addStudent(hashstu);break;
	 case 2:change(hashstu);break;
	 case 3:delete(hashstu);break;
	 case 4:search(hashstu);break;
	 case 5:System.out.println("��ӭ�´�ʹ�ã�");
     System.exit(1);

	 }
 }
 }
 static int login(String code)
 {    Scanner in=new Scanner(System.in); 
      System.out.println("����������");
      String s=in.nextLine();
      if(s.equals(code))
      {
    	  System.out.println("login succeed");
    	  return 1;
      }
      else
      {
    	  System.out.println("code error");
    	  return 0;
      }
	 
 }
  static void addStudent(HashMap<Integer,student> a)
 {   Scanner in=new Scanner(System.in); 
	 student s=new student();
	 System.out.println("������ѧ������:");
	 String name=in.nextLine();
	 s.getname(name);
	 System.out.println("������ѧ����ѧ�ţ�");
	 int number=in.nextInt();
	 s.getnumber(number);
	 System.out.println("������ѧ�������ĳɼ���");
	 while(true)
		 {int grade1=in.nextInt();
		  if(grade1<=0)
		  {
			  System.out.println("error,please input again");
		  }
		  else
		  {
			  s.getChinesegrade(grade1);
			  break;
			  
		  }
		 }
	 System.out.println("������ѧ������ѧ�ɼ���");
	 while(true)
	 {int grade1=in.nextInt();
	  if(grade1<=0)
	  {
		  System.out.println("error,please input again");
	  }
	  else
	  {
		  s.getMathgrade(grade1);
		  break;
		  
	  }
	 }
     System.out.println("������ѧ����Ӣ��ɼ�");
     while(true)
	 {int grade1=in.nextInt();
	  if(grade1<=0)
	  {
		  System.out.println("error,please input again");
	  }
	  else
	  {
		  s.getEnglishgrade(grade1);;
		  break;
		  
	  }
	 }
     System.out.println("������רҵ�γɼ�");
     while(true)
   	 {int grade1=in.nextInt();
   	  if(grade1<=0)
   	  {
   		  System.out.println("error,please input again");
   	  }
   	  else
   	  {
   		  s.getprofessionalgrade(grade1);
   		  break;
   		  
   	  }
   	 }
	 s.getsum();
	 s.getavarage();
	 a.put(number, s);
	 System.out.println("�����");
 }
 
 
 
 static void printmenu()
 {
	 System.out.println("=======ѧ����Ϣ����ϵͳ=======");
     System.out.println("       1.����ѧ��");
     System.out.println("       2.�޸�ѧ����Ϣ");
     System.out.println("       3.ɾ��ѧ��");
     System.out.println("       4.����ѧ�Ų�ѯѧ��");
     System.out.println("       5.���˳�����ϵͳ\"");
     System.out.println("========================");



 }
 static void change(HashMap<Integer,student> hs)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
     int number = sc.nextInt();
     if (hs.get(number)!=null)
     {
         Scanner in = new Scanner(System.in);
         student s = hs.get(number);
         System.out.println("��������Ҫ�޸ĵ�ѧ���ľ�����Ϣ��(���������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�)");
         String data = in.nextLine();
         if (data.equals("����"))
         {
             System.out.println("��������Ҫ�޸ĵ�������");
             String name = in.nextLine();
             s.getname(name);
             System.out.println("�޸���ɣ�");
         }


         else if (data.equals("���ĳɼ�"))
         {
             System.out.println("��������Ҫ�޸ĵ����ĳɼ���");
             int grade1 = in.nextInt();
             s.getChinesegrade(grade1);
             System.out.println("�޸���ɣ�");
         }

         else if (data.equals("��ѧ�ɼ�"))
         {
             System.out.println("��������Ҫ�޸ĵ���ѧ�ɼ���");
             int grade2 = in.nextInt();
             s.getMathgrade(grade2);
             System.out.println("�޸���ɣ�");
         }

         else if (data.equals("Ӣ��ɼ�"))
         {
             System.out.println("��������Ҫ�޸ĵ�Ӣ��ɼ���");
             int grade3 = in.nextInt();
             s.getEnglishgrade(grade3);
             System.out.println("�޸���ɣ�");
         }
         else if (data.equals("רҵ�γɼ�"))
         {
             System.out.println("��������Ҫ�޸ĵ�רҵ�γɼ���");
             int grade4 = in.nextInt();
             s.getEnglishgrade(grade4);
             System.out.println("�޸���ɣ�");
         }
     }
     
     else
     {
         System.out.println("��ѧ�������ڣ�");
     }
 }
static void delete(HashMap<Integer,student> hs)
{
	 Scanner in = new Scanner(System.in);
	 System.out.println("��������Ҫɾ��ѧ����ѧ�ţ�");
	 int number=in.nextInt();
	 if(hs.get(number)!=null)
	 {
		 hs.remove(number);
         System.out.println("ɾ���ɹ���");

	 }
	 else
	 {
		 System.out.println("��ѧ�������ڣ�");
	 }
}
static void search(HashMap<Integer,student> hs)
{ Scanner in = new Scanner(System.in);
System.out.println("��������Ҫ��ѯ��ѧ����ѧ�ţ�");
int number =in.nextInt();
if (hs.get(number)!=null)
{
    student s = hs.get(number);
    System.out.println("��ѯ�ɹ���");
    System.out.println("������"+s.name+"���ĳɼ���"+s.Chinesegrade+ "��ѧ�ɼ���"+s.Mathgrade+"Ӣ��ɼ���"+s.Englishgrade+"רҵ�γɼ���"+s.professionagrade+"ƽ���ɼ���"+s.getavarage());
    
}
else
{
    System.out.println("��ѧ�������ڣ�");
}

}
static class student
{
	int Chinesegrade;
	int Mathgrade;
	int Englishgrade;
	int professionagrade;
	String name;
	int sum;
	int number;
	double avargegrade;
	public void getname(String s)
	{
		this.name=s;
	}
	public void getChinesegrade(int a)
	{
		this.Chinesegrade=a;
	}
	public void getMathgrade(int a)
	{
		this.Mathgrade=a;
	}
	public void getEnglishgrade(int a)
	{
		this.Englishgrade=a;
	}
	public void getprofessionalgrade(int a)
	{
		this.professionagrade=a;
	}
	public void getnumber(int a)
	{
		this.number=a;
	}
	public String getname()
	{
		return this.name;
	}
	public int getChinesegrade()
	{
		return this.Chinesegrade;
	}
	public int getMathgrade()
	{
		return this.Mathgrade;
	}
	public int getEnglishgrade()
	{
		return this.Englishgrade;
	}
	public int getprofessionalgrade()
	{
		return this.professionagrade;
	}
	public int getsum() {
		int a=this.sum=this.Mathgrade+this.Chinesegrade+this.Englishgrade+this.professionagrade;
		this.sum=a;
		return a;
	}
	public double getavarage()
	{   
		this.avargegrade=this.sum/4;
		return this.avargegrade;
		
	}
}
}