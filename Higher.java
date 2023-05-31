class Higher
{
 public static void main(String args[])
 {
  int a[]={12,32,76,8,9,10};
  int result=countmax(a);
  System.out.println(result);
 }
 public static int countmax(int[] a)
 {
  int count=0;
  int primax=a[0];
  for(int i=1;i<a.length;i++)
   {
    if(a[i]>primax)
    {
     count++;
     primax=a[i];
    }
   }
  return count;
 } 
}