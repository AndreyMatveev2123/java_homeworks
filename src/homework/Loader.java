package src.homework;

public class Loader {
    public static void main(String[] args) {
        int a = 10;
        int summ = 0;
        int i;

        while (a > 0){
            a--;
            if (a == 5){
                break;
            } 
        }

        for (i = 0; i <= 49; i++){
            if (i == 45){
                continue;
            }
            summ += i;
        }
            switch (summ) {
                case 50:
                    System.out.println("50");
                    break;
                case 1180:
                    System.out.println("1180");  
                    break;
                case 1225:
                    System.out.println("1225"); 
                    break;     
                default:
                    System.out.println("Результат неверный");
                    break;
            }

            if (a == 5 && summ == 1180){
                System.out.println("\nУсловие выполнено");   
            }
            else{
                System.out.println("Условие не выполнено");
            }
        }
    }

