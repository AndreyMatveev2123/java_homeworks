package src.homework;

/* 
public class EraseStrings {
public static void main(String[] args) {
       System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
   }

   private static String removeWhiteSpaces(String str) {
       return str.replaceAll(" ", "").trim();
   }
}
*/

/* 
import java.util.Scanner;
public class EraseStrings {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       boolean isCorrectName = false;
       while (!isCorrectName) {
           String name = input.nextLine().trim(); //Считывает строку из System.in
           isCorrectName = checkName(name);
           if (!isCorrectName) System.out.println("Введите корректное имя!");
       }
    input.close();   
   }


   private static boolean checkName(String name) {
       int split_string_count = name.split(" ").length;
       return split_string_count == 3;
   }
}
*/

import java.util.Scanner;

public class EraseStrings {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       boolean isCorrectName = false;
       while (!isCorrectName) {
           String name = input.nextLine().trim(); //Считывает строку из System.in
           isCorrectName = checkName(name);
           if (!isCorrectName) {
               System.out.println("Введите корректное имя!");
           } else {
               System.out.println("Форматированное имя: " + formatName(name));
               System.out.println("Слова в имени по возрастанию длины: " + sortByLength(formatName(name)));
           }
       }
    input.close();
   }

   private static boolean checkName(String name) {
       int split_string_count = name.split(" ").length;
       return split_string_count == 3;
   }

   private static String formatName(String name) {
       String[] words = name.split(" ");
       StringBuilder formattedName = new StringBuilder();
       for (String word : words) {
        if (!word.isEmpty()) {
            formattedName.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" ");
        }
   }
       return formattedName.toString().trim();
   }

   private static String sortByLength(String name) {
       String[] words = name.split(" ");
       java.util.Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
       return String.join(" ", words);
   }
}