//Input an email from the user. You have to create a username from the email by deleting
// the part that comes after ‘@’. Display that username to the user.
import java.util.*;
public class TwentyFourth {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the email : ");
        String a=sc.next();
        String b="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='@')
            {

                break;
            }
            else
            {
                b+= a.charAt(i);
            }
        }
        System.out.println(b);


    }
}
