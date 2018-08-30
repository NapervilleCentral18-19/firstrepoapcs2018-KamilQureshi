

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
        int qrtrtot,dimetot,nicktot,penntot
        System.out.println("Enter the number of quarters");
        qrtrval = Keyboard.nextInt();//number of quarters
        System.out.println("Enter the number of dimes");
        dimeval = Keyboard.nextInt();//number of dimes
        System.out.println("Enter the number of nickels");
        nickval = Keyboard.nextInt();//number of nickels
        System.out.println("Enter the number of pennies");
        pennval = Keyboard.nextInt();//number of pennies
        total = ((qrtrval * .25) + (.10 * dimeval) + (.05 * nickval) + (.01 * pennval));
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.print("The total is " + money.format(total));
        qrtrtot = (qrtrval * 
        System.out.print(
        
        
    }
  

}
