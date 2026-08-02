//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class Twelfth {
    public static void average(int a,int b, int c)
    {
        int avg =(a+b+c)/3;
        System.out.println("Average of three numbers is : "+avg);
        return;
    }
    public static void main(String args[])
    {
        System.out.println("Enter 3 numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        average(a,b,c);
    }
}
