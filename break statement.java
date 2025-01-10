import java.util.Scanner;
public class tanved
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,t=0;
        System.out.println("enter a number");
        n=sc.nextInt(); 
        while(n>0)
        {
            t=n%2;
            if(t==0)
            {
                System.out.println("sorry its even number.Try again");
                System.out.println("enter a number");
                n=sc.nextInt();
            }
             else
            {
                 System.out.println("its odd number");
                 break;
            }
        }
        
    }
}
          
        
      
        
        
