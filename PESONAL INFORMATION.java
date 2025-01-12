import java.util.Scanner;
public class summary
{
    public void main()
    {
        String n=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        n=sc.next();
        String c=new String();
       
        System.out.println("enter your class");
        c=sc.next();
        char s;
        System.out.println("enter your section");
        s=sc.next().charAt(0);
        int a;
        System.out.println("enter your age");
        a=sc.nextInt();
        double p;
        System.out.println("enter your percentage");
        p=sc.nextDouble(); 
        System.out.println(" you are " +n+ " you study in class " +c+ " your section is " +s+ " your age is " +a+ " your percentage is " +p);
    }
}
