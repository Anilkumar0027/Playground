import java.util.Scanner;
class Main
{
    public static int power_of_number(int n,int m)
    {
        int p;
        p=(int)Math.pow(n,m);
    
    return p;
    }
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int expo=sc.nextInt();
    int power;
    power=power_of_number(base,expo);
    System.out.println(power);
    
 }
}
