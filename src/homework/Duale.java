package src.homework;

import java.util.Scanner;
public class Duale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int healthOrk = input.nextInt();
        int attackOrk = input.nextInt();
        int healthElf = input.nextInt();
        int attackElf = input.nextInt();

        int elfHealthCount = healthElf;
        int orkHealthCount = healthOrk;

        while (true){
            elfHealthCount -= attackOrk;
            orkHealthCount -= attackElf;
            if (elfHealthCount <= 0 && orkHealthCount <=0){
                System.out.println("Draw!");
                break;
            }

            else if (elfHealthCount <= 0){
                System.out.println("Orc wins!");
                break;
                
            }

            else if (orkHealthCount <= 0){
                System.out.println("Elf wins!");
                break;
            }
            

            }
        input.close();    
        }
         
    }

