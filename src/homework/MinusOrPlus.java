package src.homework;

import java.util.Scanner;
public class MinusOrPlus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ввод: ");
        int variable = input.nextInt();

        int result = variable > 10 ? variable - 10 : variable + 10;
        System.out.println("Вывод: \n" + result);

    input.close();    
    }

}
