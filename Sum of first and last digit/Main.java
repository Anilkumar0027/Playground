import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner Sc=new Scanner(System.in);
      int n=Sc.nextInt();
      int last_digit=n%10;
      int first_digit=n;
      while(n>10)
      {
        n=n/10;
      }
      first_digit=n;
      int sum=first_digit+last_digit;
      System.out.println(""+sum);
	}
  
}