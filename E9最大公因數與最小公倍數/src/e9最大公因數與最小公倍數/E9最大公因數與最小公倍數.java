
package e9最大公因數與最小公倍數;
import java.util.Scanner;
public class E9最大公因數與最小公倍數
{
    public static void main(String[] args) 
    {
    Scanner a=new Scanner(System.in);
    int b,c;
    boolean d=true;
    System.out.println("輸入兩個數:");
    b=a.nextInt(); c=a.nextInt();   
    while(d)
    {
        if(b<1||b>9999||c<1||c>9999)
         { System.out.println("輸入兩個數:");
           b=a.nextInt(); c=a.nextInt();   }
        else
        d=false;
    }
    int e;
    if(b>c)
        e=c;
    else
        e=b;
    
    for(int x=e;x>0;x--){
    if(b%x==0&&c%x==0)
      { System.out.println("最大公因數:"+x);
        System.out.println("最小公倍數:"+b*c/x);
        break;}
    }
    }
}
