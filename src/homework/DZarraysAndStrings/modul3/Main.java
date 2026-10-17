package src.homework.DZarraysAndStrings.modul3;

public class Main {
    public static void main(String[] args) {
        double[] arrFloat = {5.1, 24.45, 3.3, 66.11, 38.77, 16.9, 27.0};

        for (int i = 0; i < arrFloat.length; i++){
            System.out.println(arrFloat[i] + " ");
        }

        double totalFloat = 0;

        for (int i = 0; i < arrFloat.length; i++){
            totalFloat += arrFloat[i];
        }
        System.out.println("Сумма чисел массива: " + totalFloat);

        double max = arrFloat[0];

        for (int i = 0; i < arrFloat.length; i++){
            if (arrFloat[i] > max){
                max = arrFloat[i];
            }    
        }
        System.out.println("Наибольший элемент: " + max);
    }
}
