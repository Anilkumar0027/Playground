import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2="";
      int str_len=str1.length();
      for(int i=str_len-1;i>=0;i--)
      {
          str2=str2+str1.charAt(i);
      }
      if(str2.equals(str1))
      {
          System.out.print("Yes");
      }
      else{
          System.out.print("No");
      }
      
      
    } 
}
