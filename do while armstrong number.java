import java.util.Scanner;
public class armstrongnumber
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r,t,c,s=0;
        System.out.println("enter a number");
        n=sc.nextInt();
        t=n;
        do
        {
            r=n%10;
            c=r*r*r;
            s=s+c;
            n=n/10;
        }
        while(n>0);
        if(t==s)
        {
            System.out.println("its armstrong number");
        }
        else
        {
            System.out.println("its not armstrong number");
        }
    }
}
    
    
        
