package src.homework.DZbase;


import java.util.Locale;
public class Stringis {
    public static void main(String[] args) {
        String msg = String.format("Привет, %s! Тебе %d лет.", "Аня", 23);
        System.out.println(msg);

        String row = String.format("|%10s|%-10s|%05d|", "right", "left", 42);
        System.out.println(row);

        String pi = String.format("π ≈ %.5f", Math.PI);
        System.out.println(pi);

        String n = String.format(Locale.US, "%,d", 1_234_567);
        System.out.println(n);

        String s = String.format("%2$s потом %1$s", "A", "B");
        System.out.println(s);

        String sale = String.format("Скидка 15%% на %s", "товары");
        System.out.println(sale);

        String us = String.format(Locale.US, "%.2f", 1234.56);
        String de = String.format(Locale.GERMANY, "%.2f", 1234.56); 
        System.out.println(us);
        System.out.println(de);
    }
}
