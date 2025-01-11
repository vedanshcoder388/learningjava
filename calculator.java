import java.util.Scanner;
public class calculator
{
    public void main()
    {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        s=sc.next();
        System.out.println("welcome to my calculator "+s);
        int n,r;
        System.out.println("enter a number1");
        n=sc.nextInt();
        System.out.println("enter a number2");
        r=sc.nextInt();
        System.out.println("enter operator from  (+, - , *, /,% )");
        char op=sc.next().charAt(0);        
        switch(op)
        
        {
            case '+':System.out.println(n+r);
                   break;
            case '-':System.out.println(n-r);
                   break;
            case '*':System.out.println(n*r);
                   break;
            case '/':System.out.println(n/r);
                   break;
            case '%':System.out.println(n%r);
                     break;
            default:System.out.println("Operations not valids");
        }
    }
}
        
        
    

        
        
        
        
