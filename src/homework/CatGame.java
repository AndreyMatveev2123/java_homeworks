package src.homework;

import java.util.Scanner;
import java.util.Locale;

public class CatGame {
    static String name;
    static int age = 0;
    static double weight = 3.0;
    static int hunger = 0;
    static int play = 0;
    static int menuCount = 0;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        if (!input.hasNextLine()) return;
        name = input.nextLine().trim();

        while (input.hasNextLine()){
            String command = input.nextLine().trim();

            if (command.isEmpty()){
                continue;
            }

            if (command.equals("S")){
                break;
            }

            hunger = Math.max(0, hunger - 5);
            weight = Math.max(0.0, Math.round((weight - 0.1) * 10.0) / 10.0);
            menuCount++;

            if (menuCount % 20 == 0){
                age++;
            }
            
            switch (command) {
                case "STATE":
                    System.out.println("AGE=" + age);
                    System.out.printf(Locale.US, "WEIGHT=%.1f%n", weight);
                    System.out.println("HUNGER=" + hunger);
                    System.out.println("PLAY=" + play);
                    break;

                case "FEED1":
                    feed(40,0.20);
                    break;

                case "FEED2":
                    feed(60,0.40);
                    break;

                case "FEED3":
                    feed(80,0.60);
                    break;  
                case "PLAY":
                    if ((hunger >= 0 && hunger <= 20) || (hunger >= 90 && hunger <= 100)){
                        System.out.println("PLAY: REFUSE_HUNGER"); 
                    }    
                    else if (play == 100){
                        System.out.println("PLAY: REFUSE_TIRED");
                    }      
                    else{
                        play = Math.min(100, play + 50);
                        hunger = Math.max(0, hunger - 60);
                        weight = Math.max(0.0, Math.round((weight - 0.3) * 10.0) / 10.0);
                        System.out.println("PLAY: OK");
                        break;
                    }   
                default:
                    break;
            }
        }
        input.close();
    }

    private static void feed(int hungerAdd, double weightAdd){
        if (hunger > 50){
            System.out.println("EAT: REFUSE");
        }
        else{
            hunger = Math.min(100, hunger + hungerAdd);
            weight = Math.round((weight + weightAdd) * 10.0) / 10.0;
            System.out.println("EAT: OK");
        }
    }



}
