import java.util.Scanner;
public class Main
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     while(n>=100)
    {
      n=n/10;
    }
    //int Second=n;
    int digit=n%10;
    System.out.println(""+digit);
  }
}
    
    