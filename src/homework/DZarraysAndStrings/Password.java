package src.homework.DZarraysAndStrings;

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите имя пользователя:");
        String userName = input.nextLine();

        System.out.println("Введите пароль:");
        String password = input.nextLine();

        boolean passwordCheck = true;

        while (passwordCheck){
            if (password.length() <= 8 || password.length() >= 15){
                System.out.println("Пароль должен быть от 8 до 15 символов.");
                password = input.nextLine();
            }
            else{
                passwordCheck = false;
                System.out.printf("Отлично, %s, пароль принят.\n", userName);
            }   
}
input.close(); 
}
}