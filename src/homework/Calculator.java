package src.homework;

// Практическое задание к модулю 2. Матвеев Андрей "Калькулятор" 
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double result = 0;
        boolean hasResult = false;

        while (true){
            double firstOperand;

            if (hasResult){
                firstOperand = result;
            } else {
                System.out.print("Введите первое число (C - сброс, S - выход): ");
                String token = input.next();

                if (isExitCommand(token)){
                    break;
                }

                if (isResetCommand(token)){
                    result = 0;
                    hasResult = false;
                    continue;
                }

                firstOperand = Double.parseDouble(token);
            }

            System.out.print("Введите операцию (+, -, *, /, C - сброс, S - выход): ");
            String opToken = input.next();

            if (isExitCommand(opToken)){
                break;
            }

            if (isResetCommand(opToken)){
                result = 0;
                hasResult = false;
                continue;
            }

            char operation = opToken.charAt(0);

            System.out.print("Введите второе число (C - сброс, S - выход): ");
            String secondToken = input.next();

            if (isExitCommand(secondToken)){
                break;
            }

            if (isResetCommand(secondToken)){
                result = 0;
                hasResult = false;
                continue;
            }

            Double secondOperand = Double.parseDouble(secondToken);
            Double calculated = calculate(firstOperand, operation, secondOperand);

            if (calculated == null){
                continue;
            }

            result = calculated;
            hasResult = true;
            System.out.println("Результат: " + result);
        }
        input.close();
        System.out.println("Работа калькулятора завершена.");
    }

    private static Double calculate(double firstOperand, char operation, double secondOperand){
        switch (operation) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand == 0){
                    System.out.println("Ошибка: деление на ноль!");
                    return null;
                }
                return firstOperand / secondOperand;
            default:
                System.out.println("Ошибка: неподдерживаемая операция '" + operation + "'");
                return null;
        }
    }

    private static boolean isResetCommand(String token){
        return token.equalsIgnoreCase("C");
    }

    private static boolean isExitCommand(String token){
        return token.equalsIgnoreCase("S");
    }
}

