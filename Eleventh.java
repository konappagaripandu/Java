import java.util.*;

public class Eleventh
{
    public static void Factorial(int n)
    {
        if (n<0)
        {
            System.out.println("Invalid number");
            return;
        }
        if (n==0)
        {
            System.out.println("Factorial of ZERO is : 1");
            return;
        }

        int m=1;
        for(int i=n;i>=1;i--)
        {
           m=m*i;
        }
        System.out.println("Factorial of "+n+" is : "+m);
        return ;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorial(n);
    }
}
