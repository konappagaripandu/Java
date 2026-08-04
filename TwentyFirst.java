
import java.util.*;


public class TwentyFirst {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int cols=s.nextInt();
        int [][] numbers=new int[row][cols];
        //input
        // rows
        for (int i=0 ;i<row;i++) {
            //columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = s.nextInt();

            }
        }
        int x=s.nextInt();
        // output
        // rows
        for (int i=0 ;i<row;i++) {
            //columns
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j]==x){
                System.out.print("x found at ("+i+","+j+")");
                }
            }

        }

    }
}
