import java.util.*;
class Pattern9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=2*(n-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);
            for(int k=1;k<=s;k++)
                System.out.print(" ");
            for(int m=i;m>=1;m--)
                System.out.print(m);
            System.out.println();
            s-=2;
        }
    }
}