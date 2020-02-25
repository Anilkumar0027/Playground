import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int list[]=new int[size];
    for(int i=0;i<size;i++)
    {
      list[i]=sc.nextInt();
    }
    int f=0;
    int ln=list[0];
    for(int i=0;i<size;i++)
    {
      if(list[i]>ln)
      {
        ln=list[i];
        f=i;
      }
    }
    System.out.println(f);
  }
}
      