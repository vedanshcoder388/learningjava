import java.util.Scanner;
public class table
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+" = "+n*i);
        }
    }
}
