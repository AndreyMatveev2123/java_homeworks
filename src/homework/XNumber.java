package src.homework;

import java.util.Scanner;
public class XNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = input.nextInt();
        boolean result, result1, result2, result3, result4, result5;

        result = (true) && (3 > 4);
        System.out.println("Выражение 1: " + result);

        result1 = !(x > 0) && (x > 0);
        System.out.println("Выражение 2: " + result1);

        result2 = (x > 0) || (x < 0);
        System.out.println("Выражение 3: " + result2);

        result3 = (x != 0) || (x == 0);
        System.out.println("Выражение 4: " + result3);

        result4 = (x >= 0) || (x < 0);
        System.out.println("Выражение 5: " + result4);

        result5 = (x != 1) == !(x == 1);
        System.out.println("Выражение 6: " + result5);

    input.close();    
    }
}
