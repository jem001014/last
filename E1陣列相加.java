
package e1陣列相加;
import java.util.Scanner;
public class E1陣列相加 
{
    public static void main(String[] args) 
    {
    Scanner a=new Scanner(System.in);
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    int d;
    System.out.println("輸入第一個");
    for(int x=0;x<3;x++)
    {
        for(int y=0;y<3;y++)
      {  
        d=a.nextInt();
        b[x][y]=d;
      }
    }
    System.out.println("輸入第二個");
     for(int x=0;x<3;x++)
    {
        for(int y=0;y<3;y++)
      {
        d=a.nextInt();
        c[x][y]=d;
      }
    }
    int g[][]=new int[3][3];
      for(int x=0;x<3;x++)
    {
        for(int y=0;y<3;y++)
      {
          g[x][y]=b[x][y]+c[x][y];
          System.out.print(g[x][y]+" ");
      }
         System.out.print("\n");
    }
      
    }
}