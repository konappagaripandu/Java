//Two numbers are entered by the user, x and n. Write a function to
// find the value of one number raised to the power of another i.e. x'n.
import java.util.*;
public class Seventeenth {
    public static int power(int x,int n)
    {
        int m=1;
        for(int i=1;i<=n;i++){
            m=m*x;
        }
        return m;

    }
    public static void main(String args[])
    {
        System.out.println("Enter x and n values");
        Scanner s=new Scanner (System.in);
        int x=s.nextInt();int n=s.nextInt();
        int m=power(x,n);
        System.out.println("x power n value : "+m);
    }
}
