import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
	int arr[]=new int[m];
      int c=0,c1=0;
     for(int i=0;i<m;i++)
	{
	    arr[i]=sc.nextInt();
	}
       int n1=sc.nextInt();
	int n=sc.nextInt();
	
	for(int i=0;i<m;i++)
	{
	    if(arr[i]==n1)
	    {
	        System.out.println(i);
          c++;
	    }
    }
      if(c==0)
      {
        System.out.println("-1");
      }
      for(int i=0;i<m;i++)
	{
	    if(arr[i]==n)
	    {
	        System.out.println(i);
          c1++;
	    }
      }
      if(c1==0)
      {
        System.out.println("-1");
      }
        
	}
      
      
}



