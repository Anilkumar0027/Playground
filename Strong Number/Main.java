import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
      int fac=1;
      int sum=0;
      int temp=0;
        temp=num;
      while(num>0)
      {
          int x=num%10;
          for(int i=1;i<=x;i++)
          {
                fac=fac*i;
          }
          sum=sum+fac;
         fac=1;
          num=num/10;
      } 
      //System.out.println(sum);
      if(temp==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}