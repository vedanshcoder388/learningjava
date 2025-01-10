import java.util.Scanner;
public class armstrong
{
    public void main()
    {
      Scanner sc=new Scanner(System.in);
      int n,r,c,s=0,t;
      System.out.println("enter a number");
      n=sc.nextInt();
      t=n;
      while(n>0)
      {
          r=n%10;
          c=r*r*r;
          s=s+c;
          n=n/10;
        }
        if(s==t)
        {
       System.out.println("its armstrong number");
    }
    else
    {
        System.out.println("not armstrong number");
    }
}
}
