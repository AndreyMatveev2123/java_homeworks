package src.homework.DZbase;

public class EqualesStrings6 {
    public static void main(String[] args) {
        String name = "Иван Иванов";
        String name2 = "Петя Петров Олегович";

        int name2_length = name2.length();

        checkUserName(name, name2, name2_length);

    }

    private static void checkUserName(String name, String name2, int name2_length){
        if (name.equalsIgnoreCase(name2) == true){
            System.out.println("Выберите другое имя пользователя");
        }

        else{
            System.out.println("Отличное имя!");
            System.out.printf("Ваше имя имеет длину %d символов", name2_length);
            System.out.println("\nА без пробелов длина имени будет " + name2.replace(" ", "").length() + " символов");

        }
    }
}

