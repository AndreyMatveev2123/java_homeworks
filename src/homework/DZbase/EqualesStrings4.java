package src.homework.DZbase;

public class EqualesStrings4 {
    public static void main(String[] args) {
        String name = "Иван Иванов";
        String name2 = "Петя Петров";

        checkUserName(name, name2);

    }

    private static void checkUserName(String name, String name2){
        if (name.equalsIgnoreCase(name2) == true){
            System.out.println("Выберите другое имя пользователя");
        }

        else{
            System.out.println("Отличное имя!");
        }
    }
}
