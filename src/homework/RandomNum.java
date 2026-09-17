package src.homework;

// 13 задача
import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt = rand.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Введите число: ");
            int variable = input.nextInt();
            if (randInt < variable){
            System.out.println("Загаданное мною число меньше.");
            }
            else if (randInt > variable){
            System.out.println("Загаданное мною число больше.");
            }
            else if (randInt == variable){
            System.out.println("Совершенно верно! Это и есть загаданное мною число!");
            break;
            }
        }
    input.close();    
    }
}
