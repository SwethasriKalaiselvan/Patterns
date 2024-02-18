import java.util.*;
public class Pattern5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
            {
                if(k==1 || k==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
            {
                if(k==1 || k==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}