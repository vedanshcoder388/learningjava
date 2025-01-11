import java.util.Scanner;
public class fact
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,a=1;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(r=n;r>=1;r--)
        {
            //s=s+r;
            if(r==3)
            continue;
            System.out.println(r);
        }
        
}
}
        
