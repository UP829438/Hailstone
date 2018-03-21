package hailstone;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 * @author Connor Wallace - UP829438
 */
public class Hailstone {
    ArrayList hailArray = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hailStart = getStart();
        int hailDirection = getDirection();
        Hailstone object = new Hailstone();
        object.genHailArray(hailStart);
        if (hailDirection == 2) {
            object.reverseArray();
        }
        System.out.println("Hailstone sequence: ");
        System.out.println(object.hailArray);
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
    private static int getDirection() {
     String hailInput;
     int hailDirection;
     Scanner input = new Scanner(System.in);
     while(true) {
     System.out.println("Type 1 to go forwards in the sequence or 2 to go backwards");
     try {
             hailInput = input.next();
             hailDirection = Integer.parseInt(hailInput);
             if(hailDirection == 1 || hailDirection == 2) {
                 break;
             }
     } catch (NumberFormatException e) {
         System.out.println("Invalid input.");
     }
     }
     return hailDirection;
    }
    /**
     * @param hailstart - position for start of sequence
     * uses recursion to add to array the sequence and continue adding the next number
     */
    private void genHailArray(int hailstart) {
     if (hailstart == 1) {
        hailArray.add(hailstart);
        return;
     }
     if (hailstart % 2 == 0) {
         hailArray.add(hailstart);
         genHailArray(hailstart / 2);
     }
     if (hailstart % 2 == 1) {
         hailArray.add(hailstart);
         genHailArray((hailstart * 3) + 1);
     }
    }
    private void reverseArray() {
        Collections.reverse(hailArray);
    }
}
    
