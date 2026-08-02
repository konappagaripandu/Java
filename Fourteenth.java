//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class Fourteenth {
    public static void greatestOfTwo(int a,int b)
    {
        if (a>b){
            System.out.println(a+" Is Bigger");
        }
        else
        {
            System.out.println(b+" Is Bigger");
        }
        return;
    }
    public static void main(String args[])
    {
        System.out.println("Enter two numbers :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greatestOfTwo(a,b);
    }
}
