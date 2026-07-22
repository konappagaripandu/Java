import java.util.*;

public class Sixth {
    public static void main(String args[])
    {
        int n=10;
        for(int i=n;i>=1;i--)
        {
            int spaces=i-1;
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int j=n;j>=1;j--)
            {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
