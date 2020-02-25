import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int k;
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
	    int value=sc.nextInt();
	    int sum=0;
	    for(int i=0;i<size;i++)
	    {
	       for(int j=i+1;j<size;j++)
	       {
	           k=arr[i]+arr[j];
	       if(value==k)
	    {
	        System.out.println(arr[i]+", "+arr[j]);
	    }
	       }
           
          
	    }
    }
}