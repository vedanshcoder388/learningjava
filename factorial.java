import java.util.Scanner;
public class factorial
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,a=1;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(r=n;r>=1;r--)
        {
            s=s+r;
            
        }
        System.out.println(s);
        a=s/n;
            System.out.println("average = "+a);
    
}
}
        
       
