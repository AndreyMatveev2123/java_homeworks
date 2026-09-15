package src.homework;

// 10 задача 
import java.util.Scanner;
public class CharDecoder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char charDecode = input.next().charAt(0);
        System.out.println(decode(charDecode));
    input.close();    
    } 

    public static String decode(char charDecode){    
        switch (charDecode) {
            case 'h':
                return "Hello!";
            case 'i','m','k':
                return "I can decode!";
            case 'b':
                return "Bye!";    
            default:
                return "I don't know these symbols :(";    
        }     
    }          
}
