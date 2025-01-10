import java.util.Scanner;
public class vedansh
{
    public void main()
    {
      Scanner sc=new Scanner(System.in);
      int n,r,i=1,s=0;
      System.out.println("enter a number");
      n=sc.nextInt();
      while(n>0)
      {
          r=n%10;
          s=s+r;
          n=n/10;
          i=i*r;
        }
        if(s==i)
        {
            System.out.println("its spy number");
        }
        else
        {
            System.out.println("not spy number");
        }
    }
}
          
      
      
