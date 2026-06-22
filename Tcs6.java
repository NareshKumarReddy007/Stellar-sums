//input=10 15
//5 3 7 4 18 16 5 7 8 9
//output=1 3
 import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
             sum=sum+arr[i];
            if(sum==m)
            {
                System.out.print(1+" "+(i+1));
            }
        }
    }
}
