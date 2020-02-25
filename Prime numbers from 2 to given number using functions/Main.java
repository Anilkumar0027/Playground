import java.util.Scanner;
class Main
{
    public static void prime_number(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
             if(n%i==0)
             {
                 count++;
             }
        }
    if(count==2)
    {
        System.out.println(n);
    
    }
    }
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            prime_number(i);
        }
    
 }
}
