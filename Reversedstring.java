import java.util.*;
public class Reversedstring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String1 : ");
String str1=sc.nextLine();
System.out.println("Enter String2 : ");
String str2=sc.nextLine();
String str3=str1.concat(str2);
char ch[]=str3.toCharArray();
System.out.println("String before reverse : "+str3);
String rev=" ";
for(int i=ch.length-1;i>=0;i--)
{
rev+=ch[i];
}
System.out.println("String after reverse : "+rev);
}
}

output:

Enter String1 : 
Practice
Enter String2 : 
Geeks
String before reverse : PracticeGeeks
String after reverse :  skeeGecitcarP