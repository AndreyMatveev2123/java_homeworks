package src.homework;

import java.util.Scanner;
public class PlusOrEquals {
    public static void main(String[] args){
        System.out.println("Введите оператор: ");
        Scanner input = new Scanner(System.in);
        char operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("Считан плюс");
                break;
            case '=':
                System.out.println("Считано равно");
                break;
        }
    input.close();    
    }
}

