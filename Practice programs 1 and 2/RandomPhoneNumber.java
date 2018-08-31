

/**
 * Write a description of class RandomPhoneNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class RandomPhoneNumber
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class RandomPhoneNumber
     */
    
    public static void main  (String[] args)
    {
        Random generator = new Random();
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num7;
        
        num1 = generator.nextInt (8);
        num2 = generator.nextInt (8);
        num3 = generator.nextInt (8);
        num7 = generator.nextInt (1000);
        num4 = generator.nextInt (8);
        num5 = generator.nextInt (5);
        num6 = generator.nextInt (3);
        System.out.println(num1 + num2 + num3 + "-" + num4 + num5 + num6 + "-" + num7);
    }

    
    

}
