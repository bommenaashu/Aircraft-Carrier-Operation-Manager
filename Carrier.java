/*
 * Class Name:    Carrier
 *
 * Author:        Your Name
 * Creation Date: Tuesday, April 23 2019, 15:27 
 * Last Modified: Wednesday, April 24 2019, 18:59
 * 
 * Class Description:
 *    This is the main driver program for the
 *    OOF Assignment C, Semester 1, 2019
 *
 *    You should be able to compile this program and see the 
 *    menus.
 *
 *    The methods alreay have their headers written.
 *
 *    It is suggested that you follow the order of the menu.
 *    The order in the menu is roughly from easiest to hardest.
 *
 *    Read the whole assignment first.
 *
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Carrier
{
    private Scanner kb; 
    private Aircraft plane1;
    private Aircraft plane2;

    private final int ADD_AIRCRAFT = 1;
    private final int DISPLAY = 2;
    private final int ADD_AIRCREW = 3;
    private final int LAUNCH = 4;
    private final int LAND = 5;
    private final int LOAD_FILE = 6;
    private final int EXIT = 7;

    public static void main( String [ ] args ) throws IOException
    {
         Carrier c = new Carrier( );
         c.run( );
    }

    public Carrier( )
    {
         kb = new Scanner( System.in );
         plane1 = null;
         plane2 = null;
    }

    private void run( ) throws IOException
    {
         int choice = -1;
         while( choice != EXIT )
         {
              displayMenu( );
              System.out.print( "\n\tEnter choice >> " );
              choice = kb.nextInt( );
              // clear out the newline left after the int read
              kb.nextLine( );
              process( choice);
         }
    }

    private void displayMenu( )
    {
         System.out.println( "\n\tCarrier Ops Menu\n" );
         System.out.println( "\t" + ADD_AIRCRAFT + ". Add an aircraft");
         System.out.println( "\t" + DISPLAY + ". Display all");
         System.out.println( "\t" + ADD_AIRCREW + ". Add an aircrew");
         System.out.println( "\t" + LAUNCH + ". Launch an aircraft");
         System.out.println( "\t" + LAND + ". Recover an aircraft" );
         System.out.println( "\t" + LOAD_FILE + ". Load from file" );
         System.out.println( "\t" + EXIT + ". Close Carrier Ops" );
    }

    private void process( int choice ) throws IOException
    {
         switch( choice )
         {
              case ADD_AIRCRAFT :
                   addAircraft( );
                break;

              case DISPLAY :
                   display( );
                break;

              case ADD_AIRCREW:
                   addAircrew( );
                break;

              case LAUNCH :
                   launch( );
                break;

              case LAND :
                   land( );
                break;
               
              case LOAD_FILE :
                   loadFromFile( );
                break;

              case EXIT :
                   // just trap this choice so that it does not show
                   // as an error
                break;

              default:
                   System.out.println( choice + " is not a valid choice" );
                break;
         }
    }

    // always add to plane1 first, if both aircraft are available
    // this applies to reading from the file too.
    private void addAircraft( )
    {

    }

    private void display( )
    {

    }
 
    // Adding an aircrew does NOT have to be plane1 first and plane2
    // second. You can add an aircrew to plane2 first, provided that
    // plane2 exists and does not already have an aircrew, of course

    // aircrew call signs have to be unique

    private void addAircrew( )
    {

    }

    private void launch( )
    {

    }

   // as always check that there is at least one aircraft
   // this really should be a method !!!
    private void land( )
    {

    }

    private void loadFromFile( ) throws IOException
    {

    }
}

