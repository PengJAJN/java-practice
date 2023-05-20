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
	 case 5:System.out.println("欢迎下次使用！");
     System.exit(1);

	 }
 }
 }
 static int login(String code)
 {    Scanner in=new Scanner(System.in); 
      System.out.println("请输入密码");
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
	 System.out.println("请输入学生姓名:");
	 String name=in.nextLine();
	 s.getname(name);
	 System.out.println("请输入学生的学号：");
	 int number=in.nextInt();
	 s.getnumber(number);
	 System.out.println("请输入学生的语文成绩：");
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
	 System.out.println("请输入学生的数学成绩：");
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
     System.out.println("请输入学生的英语成绩");
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
     System.out.println("请输入专业课成绩");
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
	 System.out.println("已添加");
 }
 
 
 
 static void printmenu()
 {
	 System.out.println("=======学生信息管理系统=======");
     System.out.println("       1.新增学生");
     System.out.println("       2.修改学生信息");
     System.out.println("       3.删除学生");
     System.out.println("       4.依据学号查询学生");
     System.out.println("       5.依退出管理系统\"");
     System.out.println("========================");



 }
 static void change(HashMap<Integer,student> hs)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("请输入你要修改的学生学号：");
     int number = sc.nextInt();
     if (hs.get(number)!=null)
     {
         Scanner in = new Scanner(System.in);
         student s = hs.get(number);
         System.out.println("请输入您要修改的学生的具体信息：(姓名，语文成绩，数学成绩。英语成绩)");
         String data = in.nextLine();
         if (data.equals("姓名"))
         {
             System.out.println("请输入您要修改的姓名：");
             String name = in.nextLine();
             s.getname(name);
             System.out.println("修改完成！");
         }


         else if (data.equals("语文成绩"))
         {
             System.out.println("请输入您要修改的语文成绩：");
             int grade1 = in.nextInt();
             s.getChinesegrade(grade1);
             System.out.println("修改完成！");
         }

         else if (data.equals("数学成绩"))
         {
             System.out.println("请输入您要修改的数学成绩：");
             int grade2 = in.nextInt();
             s.getMathgrade(grade2);
             System.out.println("修改完成！");
         }

         else if (data.equals("英语成绩"))
         {
             System.out.println("请输入您要修改的英语成绩：");
             int grade3 = in.nextInt();
             s.getEnglishgrade(grade3);
             System.out.println("修改完成！");
         }
         else if (data.equals("专业课成绩"))
         {
             System.out.println("请输入您要修改的专业课成绩：");
             int grade4 = in.nextInt();
             s.getEnglishgrade(grade4);
             System.out.println("修改完成！");
         }
     }
     
     else
     {
         System.out.println("该学生不存在！");
     }
 }
static void delete(HashMap<Integer,student> hs)
{
	 Scanner in = new Scanner(System.in);
	 System.out.println("请输入您要删除学生的学号：");
	 int number=in.nextInt();
	 if(hs.get(number)!=null)
	 {
		 hs.remove(number);
         System.out.println("删除成功！");

	 }
	 else
	 {
		 System.out.println("此学生不存在！");
	 }
}
static void search(HashMap<Integer,student> hs)
{ Scanner in = new Scanner(System.in);
System.out.println("请输入您要查询的学生的学号：");
int number =in.nextInt();
if (hs.get(number)!=null)
{
    student s = hs.get(number);
    System.out.println("查询成功！");
    System.out.println("姓名："+s.name+"语文成绩："+s.Chinesegrade+ "数学成绩："+s.Mathgrade+"英语成绩："+s.Englishgrade+"专业课成绩："+s.professionagrade+"平均成绩："+s.getavarage());
    
}
else
{
    System.out.println("该学生不存在！");
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