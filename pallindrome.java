import java.util.Scanner;
public class pallindrome
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,t;
        System.out.println("enter a number");
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(t==s)
        {
            System.out.println("its pallindrome");
        }
        else
        {
            System.out.println("not pallindrome");
        }
    }
}
      
      
