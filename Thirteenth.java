//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class Thirteenth {
    public static void sumOfOdd(int n) {
        int m = ((n + 1) / 2) * ((n + 1) / 2);
        System.out.println("sum of all odd numbers from 1 to n is :" + m);
        return;
    }
    public static void main(String args[])
    {
        System.out.println("Enter the n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumOfOdd(n);
    }
}
