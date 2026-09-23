package src.homework;

import java.util.Scanner;
public class PiercingSalon {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int age = input.nextInt();

        if (age < 14){
            System.out.println("Прокол ушей в присутствии родителей");
        }
        else if (age < 18){
            System.out.println("Прокол ушей, пупка, языка, носа в присутствии родителей");
        }
        else{
            System.out.println("Без ограничений");
        }
        // input.close();
        }
    }

