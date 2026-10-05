package src.homework.DZbase;

public class EqualesStrings5 {
    public static void main(String[] args) {
        String name = "Иван Иванов";
        String name2 = "Петя Петров";

        int name2_length = name2.length();


        if (name.equalsIgnoreCase(name2) == true){
            System.out.println("Выберите другое имя пользователя");
        }

        else{
            System.out.println("Отличное имя!");
            System.out.printf("Ваше имя имеет длину %d символов", name2_length);
        }
    }
}
