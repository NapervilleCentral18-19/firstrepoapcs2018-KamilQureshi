
/**
 * Prints a nametag given someone's full name
 * Kamil Qureshi
 * APCS
 * Mr. Hayes
 * Period 7
 */
import java.util.Scanner;
public class Firstlastmiddle
{
     public static void main (String[] args)
    {
        String name1, name2, name3, name4, name5;
        int val1, val2, length, length2;
        char middle;
        System.out.println("Type your full name");
        Scanner scan = new Scanner (System.in);
        name1 = scan.nextLine();//initial
        val1 = name1.indexOf(" ");//value of first space
        name2 = name1.substring (0, val1);//First name
        length = name1.length();//length of full name
        name3 = name1.substring ((val1 + 1), length);//middle and last name
        val2 = name3.indexOf(" ");//value of second space
        length2 = name3.length();//length of middle and last name
        middle = name3.charAt (0);//middle inital
        name4 = name3.substring ((val2 + 1), length2);//last name
        System.out.println(name2 + " " + middle + ".");// prints first name and last inital
        System.out.println(name4);// prints last name
        
    }
}
