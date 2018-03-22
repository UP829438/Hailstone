package hailstone;
import java.util.*;
/**
 * @author Connor Wallace - UP829438
 */
public class Hailstone {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hailStart = getStart();
        boolean hailDirection = getDirection();
        genHailArray(hailStart, hailDirection);
    }
    /**
     * @return hailStart - starting position for the hailstone sequence.
     */
    private static int getStart() {
     String hailInput;
     int hailStart;
     Scanner input = new Scanner(System.in);
     while(true) {
     System.out.println("Please enter the starting number for the hailstone sequence: ");
     try {
             hailInput = input.next();
             hailStart = Integer.parseInt(hailInput);
             if (hailStart >= 1) {
                 break;
             }
             System.out.println("Number must be greater than 0");
             
     } catch (NumberFormatException e) {
         System.out.println("Invalid input.");
     }
     }
     return hailStart;
    }
    /**
     * @return hailDirection - whether the user wants the array to be reversed or not
     */
    private static boolean getDirection() {
     String hailInput;
     int hailDirection;
     Scanner input = new Scanner(System.in);
     while(true) {
     System.out.println("Type 1 to go forwards in the sequence or 2 to go backwards");
     try {
             hailInput = input.next();
             hailDirection = Integer.parseInt(hailInput);
             if(hailDirection == 1) return true;
             if(hailDirection == 2) return false;
             System.out.println("Invalid number entered.");
     } catch (NumberFormatException e) {
         System.out.println("Invalid input.");
     }
     }
    }
    /**
     * @param hailstart - position for start of sequence
     * uses recursion to print the sequence and continue adding the next number
     */
    private static void genHailArray(int hailstart, boolean haildirection) {
     if (hailstart == 1) {
        System.out.println(hailstart);
        return;
     }
     if (haildirection) System.out.println(hailstart + "");
     if (hailstart % 2 == 0) {
         genHailArray(hailstart / 2, haildirection);
     }
     if (hailstart % 2 == 1) {
         genHailArray((hailstart * 3) + 1, haildirection);
     }
     if(!haildirection) System.out.println(hailstart + "");
    }
}
    
