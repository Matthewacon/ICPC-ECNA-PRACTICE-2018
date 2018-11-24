import java.util.Scanner;

public class F {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  String[] data = s.next().split(" ");
  final int 
   s1 = Integer.valueOf(data[0]),
   n = Integer.valueOf(data[1]),
   m = Integer.valueOf(data[2]);
  data = s.next().split(" ");
  int 
   peakCount = 0, 
   troughCount = 0,
   lastDay = Integer.valueOf(data[0]),
   incRun = n,
   decRun = 0;
  for (int i = 1; i < s1; i++) {
   final int today = Integer.valueOf(data[i]);
   if (lastDay > today) {
    if (decRun != 0) {
     //Deal with a change in direction
     if (decRun >= m) {
      troughCount += 1;
     }
     decRun = 0;
    }
    incRun++; 
   } else {
    if (incRun != 0) {
     if (incRun >= n) {
      //Deal with a change in direction
      peakCount += 1;
     }
     incRun = 0;
    }
    decRun++;
   }
   lastDay = today;
  }
  System.out.println(peakCount + " " + troughCount);
 }
}
