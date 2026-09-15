package src.homework;

// 9 задача 
import java.util.Scanner;
public class TrafficLights {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String traffic = input.nextLine().trim();

        switch (traffic) {
            case "красный":
                System.out.println("остановиться");
                break;
            case "желтый":
                System.out.println("подождать");
                break;
            case "зеленый":
                System.out.println("ехать");   
                break; 
        }
    input.close();    
    }
}
