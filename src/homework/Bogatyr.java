package src.homework;

public class Bogatyr {
    private String heroName = "Добрыня";
    private String heroClass = "Богатырь";
    private String heroWeapon = "Меч - Кладенец (Урон: 100)";
    private int weaponDamage = 100;
    private final int golovaB = 1;

    public static void main(String[] args) {
        Bogatyr bogatyr = new Bogatyr();
        bogatyr.idtiBitGorynycha();
        bogatyr.golovy();
        bogatyr.bitva();
    }

    public void exitFromKiev() {
        System.out.println("Выходим из Киева...");
    }

    public void goToKudykinaGora() {
        System.out.println("Идем на Кудыкину гору...");
    }

    public void saddleHorse() {
        System.out.println("Садимся на коня...");
    }

    public void searchGorynych() {
        System.out.println("Где эта змеюка...?");
    }

    public void idtiBitGorynycha() {
        exitFromKiev();
        goToKudykinaGora();
        saddleHorse();
        searchGorynych();
    }

    public void golovy() {
        if (golovaB < 3) {
            System.out.println("Одна голова хорошо, а три - уже Горыныч.");
        }
    }

    public void bitva() {
        int udar = 0;
        int totalDamage = 0;

        while (udar < 3) {
            udar++;
            totalDamage += weaponDamage;

            if (udar == 1) {
                System.out.println("Первая голова отрублена");
            } else if (udar == 2) {
                System.out.println("Вторая голова отрублена");
            } else if (udar == 3) {
                System.out.println("Третья голова отрублена");
            }

            System.out.println("Суммарный урон: " + totalDamage);
        }

        if (udar == 3) {
            System.out.println("Горыныч побежден.");
        }
    }
}
