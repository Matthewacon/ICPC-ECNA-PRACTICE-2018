import java.util.Scanner;

public class D {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimtier("\n|\r");
  
  for (int i = Integer.valueOf(s.next()); i > 0; i--) {
    
  }
 }

 public static int clockToSeconds(final String clock) {
  final String[] data = clock.split(":");
  return 60 * Integer.valueOf(data[0]) + Integer.valueOf(data[1]);
 }

 public static String secondsToClock(final int seconds) {
  final float f = seconds / 60f;
  return Math.floor(f) + ":" + (int)(60 * (f - Math.floor(f)));
 }
}
