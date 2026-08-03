
// Array declaration
import java.util.*;

public class Nineteenth {
    public static void main(String args[] )
    {
        int marks[]=new int[3];
        marks[0]=34;
        marks[1]=67;
        marks[2]=78;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        // At a time all the marks as output
           // and giving data to in different way
        int score[]={89,56,809};
        for (int i=0;i<3;i++)
        {
         System.out.println(score[i]);
        }
        // java has default taking of zeros in as input , if you not mention
        System.out.println("Enter the size of array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }


    }
}
