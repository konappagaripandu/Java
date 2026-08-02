//Write a function that takes in the radius as input and returns the circumference
// of a circle.
import java.util.*;
public class Fifteenth {
    public static void circumference(float r)
    {
        double cr=2*3.14*r;
        System.out.println("Circumference of circle is  : "+cr);
        return;

    }
    public static void main(String args[])
    {
        System.out.println("Enter radius value :");
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        circumference(r);

    }
}
