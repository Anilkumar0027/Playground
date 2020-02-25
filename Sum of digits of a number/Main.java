import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n,sum=0;
      while(m>0)
      {
        n=m%10;
        sum=sum+n;
        m=m/10;
	}
      System.out.println(""+sum);
    }
}