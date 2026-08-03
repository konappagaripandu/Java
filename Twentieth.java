import java.util.*;

public class Twentieth {
    public static void main(String args[]){
        System.out.println("Enter the array size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter the array elements");
        for (int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the x value to find:");
        int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==x)
            {
                System.out.println("X found in index : "+i);
            }
        }
    }
}
