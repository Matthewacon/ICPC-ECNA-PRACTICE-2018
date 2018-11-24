import java.util.Scanner;

public class A {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  String[] data = s.next().split(" ");
  final int 
   x = Integer.valueOf(data[0]),
   y = Integer.valueOf(data[1]);
  int 
   radius = 1000,
   canHear = 0;
  for (int i = Integer.valueOf(data[2]); i > 0; i--) {
   data = s.next().split(" ");
   final int
    x1 = Integer.valueOf(data[0]),
    y1 = Integer.valueOf(data[1]),
    r = Integer.valueOf(data[2]),
    radiusSum = radius + r;
   final double dist = distance(x, y, x1, y1);
   if (dist < (r + radius) && canHear > 1) {
    radius = (int)(dist - r);
    if (radius <= 0) {
     radius = 0;
     break;
    }
   } else {
    canHear++;
   }
  }
  System.out.println(radius);
 }

 public static double distance(double x1, double y1, double x2, double y2) {
  return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
 }
}
