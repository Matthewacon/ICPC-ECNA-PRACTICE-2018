import java.util.Scanner;

public class B {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  String sHarshad;
  int 
   iHarshad = Integer.valueOf(s.next()),
   sum;
  do {
   sHarshad = new Integer(iHarshad).toString();
   sum = 0;
   for (int i = 0; i < sHarshad.length(); i++) {
    sum += Integer.valueOf(sHarshad.substring(i, i + 1));
   }
   iHarshad += 1;
  } while((iHarshad - 1) % sum != 0);
  System.out.println(sHarshad);
 }
}
