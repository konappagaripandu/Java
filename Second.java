
import java.util.*;
public class Second {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age > 18){
            System.out.println("adult");
        }
        else{
            System.out.println("not an adult");
        }
        int x=sc.nextInt();
        if (x%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
