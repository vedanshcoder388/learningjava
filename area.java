import java.util.Scanner;
public class area
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int l,b,s,r,a;
        System.out.println("select a shape(1rectangle,2square,3circle)");
        a=sc.nextInt();
        switch(a)
        {
            case 1:System.out.println("enter length");
                    l=sc.nextInt();
                    System.out.println("enter breadth");
                    b=sc.nextInt();
                    System.out.println(l*b);
                    break;
            case 2:
                    System.out.println("enter side");
                    s=sc.nextInt();
                    System.out.println(s*s);
                           break;
            case 3:System.out.println("enter radius");
                   r=sc.nextInt(); 
                   System.out.println(3.14*r*r);
                           break;
            default:System.out.println("not valid");
        }
    }
}
        
