import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to be checked : ");
int n = sc.nextInt();
Prime ob=new Prime();
ob.check(n);
}
void check(int n)
{
if(n<0)
System.out.println("Please enter a positive integer");
else
prime(n);
}
void prime(int n)
{
int c=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
++c;
}
if(c>=1)
System.out.println("Entered number is not a prime number");
else
System.out.println("Entered number is a prime number");
}
}