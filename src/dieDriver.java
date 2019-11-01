import javax.swing.*;
import java.util.Scanner;

public class dieDriver
{
    public static void main (String[] args)
    {
        int numThing;//sets main variable
        Scanner keyboard = new Scanner(System.in);//put in keyboard

        System.out.println("Enter a Number of sides: ");
        numThing = keyboard.nextInt();//allows for int in die calculation

        System.out.println("The die has " + numThing + " sides");

        Die die1 = new Die(numThing);//driver being set

        System.out.println("The side that was rolled on was : " + die1.roll());
        //main method is executed
    }//close main void

}//close class dieDriver
