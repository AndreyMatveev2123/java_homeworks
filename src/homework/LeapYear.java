package src.homework;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        int year;
        boolean isLeapYear;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите год: ");
        year = input.nextInt();
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " год — високосный: " + (isLeapYear ? "да" : "нет"));
    input.close();    
    }

}
