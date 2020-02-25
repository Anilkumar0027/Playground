import java.util.Scanner;
class Main{
  public static int sum_of_number(int m)
 {
     int s=0;
     for(int i=1;i<=m;i++)
     {
         s=s+i;
     }
     return s;
  }
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int sum;
     sum=sum_of_number(n); 
     System.out.println(sum);
	}
}