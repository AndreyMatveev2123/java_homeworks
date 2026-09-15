package src.homework;

import java.util.Scanner;
public class LogicNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ввод: ");
        int num = input.nextInt();

        if (num >= 1 && num <= 100 || num < 0){
            System.out.println(true);
        }    
        else{
            System.out.println(false);
        }
    input.close();               
    }
}
