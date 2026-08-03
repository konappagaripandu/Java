//Write a function that takes in age as input and returns
// if that person is eligible to vote or not. A person of
// age > 18 is eligible to vote.
import java.util.*;

public class Sixteenth {
    public static void vote(int age)
    {
        if (age>18){
            System.out.println("Eligible for vote");
            return;
        }
        else {
            System.out.println("NOT Eligible for vote");
            return;
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter your age :");Scanner dc=new Scanner(System.in);
        int age=dc.nextInt();
        vote(age);
    }

}
