package src.homework;

public class TerninalOperator {
    public static void main(String[] args) {
        int age = 17; // пример значения
        int ticketPrice;
        // Тернарный оператор
        ticketPrice = (age >= 16) ? 20 : 10;
        System.out.println(ticketPrice);
    }
}
