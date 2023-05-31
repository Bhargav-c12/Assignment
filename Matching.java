import java.util.*;
public class Matching
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  System.out.println("enter the string:");
  String str=s.next();
  int count1=0,count2=0;
  for(int i=0;i<str.length();i++)
  {
   if(str.charAt(i)=='(')
   {
    count1++;
   }
    if(str.charAt(i)=='(')
   {
    count2++;
   }
  }
 if(count1==count2)
 {
  System.out.println("No Error");
 }
 else
 {
  System.out.println("Error");
 }
}
}


