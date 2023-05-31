import java.util.*;
public class Stringvalid
{
 	public static void main(String[] args)
 	{
        		
        String str="Hell**o";
        int count1=0,count2=0;
        for(int i=0;i< str.length();i++)
    	{
            if(str.charAt(i)=='*')
        		count1++;
            else if(str.charAt(i)=='#')
         		count2++;
    		}
			System.out.println("NO. of *'s:"+count1);
			System.out.println("NO. of #'s:"+count2);
        System.out.println(count1-count2);
	}
}