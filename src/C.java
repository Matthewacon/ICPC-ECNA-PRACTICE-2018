import java.util.Scanner;

public class C {
 public static final String[][] REPLACEMENTS  = new String[][] {
  new String[] {"@", "at"},
  new String[] {"&", "and"},
  new String[] {"1", "one", "won"},
  new String[] {"2", "to", "too", "two"},
  new String[] {"4", "for", "four"},
  new String[] {"b", "bea", "be", "bee"},
  new String[] {"c", "sea", "see"},
  new String[] {"i", "eye"},
  new String[] {"o", "oh", "owe"},
  new String[] {"r", "are"},
  new String[] {"u", "you"},
  new String[] {"y", "why"}
 };

 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  String output = "";
  for (int i = Integer.valueOf(s.next()); i > 0; i--) {
   final String[] words = s.next().split(" ");
   for (int j = 0; j < words.length; j++) {
    output = output + (j == 0 ? "" : " ") + replace(words[j]);
   }
   output = output + "\n";
  }
  System.out.print(output);
 }

 public static String replace(String word) {
  final boolean uppercase = Character.isUpperCase(word.charAt(0));
  for (final String[] arr : REPLACEMENTS) {
   final String replacement = arr[0];
   for (int i = 1; i < arr.length; i++) {
    word = word.toLowerCase().replaceAll(arr[i], replacement);
   }
  }
  char firstChar = word.charAt(0);
  if (96 < firstChar && firstChar < 123 && uppercase) {
   firstChar = Character.toUpperCase(firstChar);
  }
  return firstChar + word.substring(1);
 }
}
