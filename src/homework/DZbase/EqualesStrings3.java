package src.homework.DZbase;

public class EqualesStrings3 {
    public static void main(String[] args) {
        String name = "Иван Иванов";
        String name2 = "Петя Петров";

        if (name.equalsIgnoreCase(name2) == true){
            System.out.println("Выберите другое имя пользователя");
        }

        else{
            System.out.println("Отличное имя!");
        }
    }
}
