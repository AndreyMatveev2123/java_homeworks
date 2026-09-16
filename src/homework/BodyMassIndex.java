package src.homework;


import java.util.Scanner;
import java.util.Locale;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double bodyWeight;
        double bodyHeight;

        bodyWeight = input.nextDouble();
        bodyHeight = input.nextDouble(); 

        if (bodyWeight < 0){
            System.out.println("Ошибка: вес и рост должны быть положительными числами.");

        }
        else if (bodyHeight < 0){
            System.out.println("Ошибка: вес и рост должны быть положительными числами.");  
        }
        else{
            System.out.println(BMI(bodyWeight, bodyHeight)); 
        }
    input.close();
    }

    private static String BMI(double bodyWeight, double bodyHeight){
        double result = bodyWeight / (bodyHeight * bodyHeight);
        String message;

        if (result < 18.5){
            message = ("Ваш индекс массы тела ниже нормы. Возможно, стоит обратить внимание на питание.");
        }   
        else if (result >= 18.5 && result <= 24.9){
            message = ("Ваш индекс массы тела в норме! Продолжайте в том же духе.");
        }        
        else if (result >= 25 && result <= 29.9){
            message = ("Ваш индекс массы тела немного выше нормы. Рассмотрите возможность сбалансированного питания и физической активности.");
        }      
        else {
            message = ("Ваш индекс массы тела значительно выше нормы. Рекомендуем проконсультироваться с врачом или специалистом по питанию для получения рекомендаций.");
        }

        String formattedResult = String.format(Locale.US, "%.1f", result);
        return "ИМТ: " + formattedResult + " — " + message;     
        
    }
}
