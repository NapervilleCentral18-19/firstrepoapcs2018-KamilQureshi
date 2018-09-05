
/**
 * Generates and prints a random phone number
 *
 * Kamil Qureshi
 * APCS
 * Mr. Hayes
 * Period 7
 */
import java.util.Random;
public class Randomphonenumber
{
    public static void main (String[] args)
    {
        Random gen = new Random();
        int num1, num2, num3, num4, num5, num6, num7;
        // sets values for all numbers
        num1 = gen.nextInt(8);
        num2 = gen.nextInt(8);
        num3 = gen.nextInt(8);
        num4 = gen.nextInt(8);
        num5 = gen.nextInt(5);
        num6 = gen.nextInt(3);
        num7 = gen.nextInt(10000);
        // prints out the generated digits as a phone number
        System.out.print("Your phone number is ");
        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3 + "-");
        System.out.print(num4);
        System.out.print(num5);
        System.out.print(num6 + "-");
        System.out.println(num7);
        
    }
    }