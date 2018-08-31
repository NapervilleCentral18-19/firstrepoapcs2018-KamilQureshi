

/**
 * Write a description of class HOWMANYOFEACHCOIN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class HOWMANYOFEACHCOIN
{
       public static void main  (String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        double total;
        int qrtrval;
        int dimeval;
        int nickval;
        int pennval;
        double qrtrtot;
        double dimetot; 
        double nicktot; 
        double penntot;
        
        System.out.println("Enter the number of quarters");
        qrtrval = Keyboard.nextInt();//number of quarters
        System.out.println("Enter the number of dimes");
        dimeval = Keyboard.nextInt();//number of dimes
        System.out.println("Enter the number of nickels");
        nickval = Keyboard.nextInt();//number of nickels
        System.out.println("Enter the number of pennies");
        pennval = Keyboard.nextInt();//number of pennies
        
        //totaling coin values
        total = ((qrtrval * .25) + (.10 * dimeval) + (.05 * nickval) + (.01 * pennval));
        //formatting output to money
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("The total is " + money.format(total));
        qrtrtot = (qrtrval);
        System.out.println("There are " + qrtrtot + " quarters");
        dimetot = (dimeval);
        System.out.println("There are " + dimetot + " dimes");
        nicktot = (nickval);
        System.out.println("There are " + nicktot + " nickels");
        penntot = (pennval);
        System.out.println("There are " + penntot + " pennies");
    }
  

}
