package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

      // TODO -- add your code here

      // We declare and assign the total width and height of canvas
      int width = size * 2 + 2;
      int height = size * 2 + 1;
      for(int i = 1; i <= height; i++) {
        for (int j = 1; j <= width; j++) {

          //First we draw the rectangle that contain the diamond

          //Statement for print sign + in all corners
          if ((i == 1 || i == height) && (j == 1 || j == width))
            mOut.print("+");
          //Statement for print sign - in the horizontal sides
          else if ((i == 1 || i == height) && !(j == 1 || j == width))
            mOut.print("-");
          //Statement for print sign | in the vertical sides
          else if (!(i == 1 || i == height) && (j == 1 || j == width))
            mOut.print("|");
          //Call method to draw the diamond
          else {

            printDiamond(size, width, height);
          }

        }
        mOut.println();
      }

    }

    public static void drawDiamond(int size, int width, int height){
      
    }
}
