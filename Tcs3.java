import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int count=0;
        if(start<0||end<0)
        {
            System.out.println("Invalid");
        }
        for(int i=start;i<=end;i++)
        {
            int num=i;
            int rev=0;
            while(num>0)
            {
                int a=num%10;
                rev=rev*10+a;
                num=num/10;
            }
            if(i==rev)
            {
                System.out.print(rev);
                count++;
                System.out.println();
            }
        }
    
            System.out.println("count is "+count);
        
    }
}
