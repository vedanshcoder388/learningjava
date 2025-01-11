import java.util.Scanner;
public class neon
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,m;
        System.out.println("enter a number");
        n=sc.nextInt();
        m=n*n;
        while(m>0)
        {
            r=n%10;
            s=s+m;
            m=m/10;
        }
        if(n==s)
        {
            System.out.println("its neon number");
        }
        else
        {
            System.out.println("its not neon number");
        }
    }
}
    
            
        
