import java.util.Scanner;
public class vowel
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.println("enter a number");
        a=sc.next().charAt(0);
        switch(a)
        {
            case 'a':System.out.println("vowel");
                   break;
            case 'e':System.out.println("vowel");
                   break;
            case 'i':System.out.println("vowel");
                   break;
            case 'o':System.out.println("vowel");
                   break;
            case 'u':System.out.println("vowel");
                   break;
            case 'A':System.out.println("vowel");
                   break;
            case 'E':System.out.println("vowel");
                   break;
            case 'I':System.out.println("vowel");
                   break;
            case 'O':System.out.println("vowel");
                   break;
            case 'U':System.out.println("vowel");
                   break;
            default:System.out.println("not vowel");
        }
    }
}
       
