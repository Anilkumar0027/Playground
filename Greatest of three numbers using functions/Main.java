import java.util.Scanner;
class Main{
  public static void GCN(int a,int b,int c)
  {
    int max,Gcn,man;
    if(a>b)
    {
      	max=a;
    }
    else
    {
     	 max=b;
    }
    	if(max>c)
   		 {
      		man=max;
    	 }
    	else
    	 {
     		man=c;
   		 }
    System.out.println(man);
  }
    
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      GCN(n1,n2,n3);
	}
}