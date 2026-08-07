
import java.util.*;
public class TwentyFifth {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
        // set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        // delete the  particular string
        sb.delete(1,2);
        // here 1 is starting index and 2 is the( < ending index)
        System.out.println(sb);
        // after the append function adding at end
        sb.append('S');
        sb.append("ta");
        sb.append('r');
        System.out.println(sb);
    }
}
