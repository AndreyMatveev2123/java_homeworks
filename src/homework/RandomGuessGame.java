package src.homework;

// 14 задача
import java.util.Random;
import java.util.Scanner;

public class RandomGuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(20) + 1;
        int attempts = 0;
    
        while (true){
            int guess;
            if (!input.hasNextInt()){
                System.out.println("Ошибка: введите целое число!");
                input.next();
                continue;
            }
            guess = input.nextInt();

            if (guess > target){
                System.out.println("Загаданное мною число меньше.");
                attempts++;
                 if (attempts == 5){
                    System.out.println("Конец игры.\n" + "Мною было загадано число: " + target);
                    break;
                }
            }
            else if (guess < target){
                System.out.println("Загаданное мною число больше.");
                attempts++;
                if (attempts == 5){
                    System.out.println("Конец игры.\n" + "Мною было загадано число: " + target);
                    break;
                }

            }
            else if (guess == target){
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                break;            
            }
        }
    input.close();    
    }
}


