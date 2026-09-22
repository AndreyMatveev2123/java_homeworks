package src.homework;

public class ConditionsAndCycles {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
        b = b + c; // b = 5
        // a = a * b; // a = 12
        c = a - c; // c = 10
        // a = a + b; // a = 17
        a = a - b; // a = 12
        c = a + b; // c = 17
        // b = c / a; // b = 1
         a = b + c; // a = 18
        a = a + c + b; // 

        for (int i = 0; i < 20; i++){
            System.out.println(a);

        }
    }
}
