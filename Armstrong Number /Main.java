import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int sum=0;
      int temp=0;
      temp=num;
      while(num>0)
      {
        int x=num%10;
        sum+=x*x*x;
        num=num/10;
      }
      if(temp==sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
    
	}
}