import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i;
      for(i=1;i<=n;i++);
      {
        //if(i%2!=0)
        for(i=1;i<=n;i+=2)
        {
          System.out.println(i+"");
        }
      }
	}
}