import java.util.Scanner;

public class E {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  final String[] data = s.next().split(" ");
  final double 
   t = Double.valueOf(data[0]),
   peez = Double.valueOf(data[1]),
   pizz = Double.valueOf(data[2]);
  final long ceil = (long)Math.floor(t / pizz);
  long peezFactor = 0, pizzFactor = ceil; 
  while (peezFactor < ceil + 1) { 
   if ((peezFactor * peez + pizzFactor * pizz) == t) {
    //Check that both factors are whole numbers 
    if (Math.floor(peezFactor) == peezFactor && Math.floor(pizzFactor) == pizzFactor) {
     System.out.println(peezFactor + " " + pizzFactor);
    }
   }
   if (pizzFactor - 1 < 0) {
    pizzFactor = ceil;
    peezFactor += 1;
   } else {
    pizzFactor -= 1;
   }
  }
 }
}
