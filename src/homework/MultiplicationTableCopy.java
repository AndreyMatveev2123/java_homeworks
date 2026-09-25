package src.homework;

public class MultiplicationTableCopy {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            StringBuilder row = new StringBuilder();
            row.append(i);

            for (int j = 1; j <= 9; j++) {
                row.append(' ').append(i * j);
            }
            System.out.println(row.toString());
        }
    }
}
