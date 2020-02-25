import java.util.Scanner;
class Main
{
   public static int Square_of_number(int m)
  {
      int Square;
    Square=m*m;

  return Square;
  }
	public static void main (String[] args)
    {
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int Sq=Square_of_number(n);
      System.out.println(Sq); 
	} 
}