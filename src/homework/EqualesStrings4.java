package src.homework;

public class EqualesStrings4 {
    public static void main(String[] args) {
        String name = "Иван Иванов";
        String name2 = "Петя Петров";

        checkUserName(name, name2);

    }

    public static boolean checkUserName(String name, String name2){
        if (name.equalsIgnoreCase(name2) == true){
            System.out.println("Выберите другое имя пользователя");
            return true;
        }

        else{
            System.out.println("Отличное имя!");
            return false;
        }
    }
}
