import java.util.Scanner;
public class nivennumber
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0;
        System.out.println("enter a number");
         n=sc.nextInt();
        do
        {
           
            r=n%10;
            s=s+r;
            n=n/10;
        }
        while(n>0);
        if(s%3==0)
        {
          System.out.println("its niven number");
        }
        else
        {
            System.out.println("not niven number");
        }
    }
}
        
            
        
        
        
            
