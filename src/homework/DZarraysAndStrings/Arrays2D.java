package src.homework.DZarraysAndStrings;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        String[] arr1 = new String[]{"Саша", "Игорь", "Миша","Коля", "Владимир"}; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        int sumArr = 0;
        for (int num : arr[i]) {
            sumArr += num;
        }
            System.out.println(arr1[i] + " " + sumArr);
        }
    }
}


