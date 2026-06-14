import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int layers=sc.nextInt();
        int n=1;
        for(int i=1;i<=layers;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int term=8*n*n-2*n;
                System.out.printf("%05d ",term);
                n++;
            }
            System.out.println();
        }
    }
}
