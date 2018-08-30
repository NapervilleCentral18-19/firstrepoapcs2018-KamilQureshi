

/**
 * Write a description of class Dankestmodulusmemes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Areaandcircofacircle
{
public static void main  (String[] args)
{
    double radius;
    double circ;
    double area;
    Scanner Keyboard = new Scanner(System.in);
    System.out.println("Enter the radious");
    radius = Keyboard.nextDouble();
    area = Math.pow(radius,2) * Math.PI;
    circ = 2 * Math.PI * radius;
    System.out.println("The area is " + area);
    System.out.println("The circumference is " + circ);
    
}

}
