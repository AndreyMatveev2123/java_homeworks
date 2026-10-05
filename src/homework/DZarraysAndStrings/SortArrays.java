package src.homework.DZarraysAndStrings;

public class SortArrays {
public static void main(String[] args){

    int[] arr = {5, 24, 3, 66, 38, 16, 27};
    java.util.Arrays.sort(arr);
    System.out.println("Отсортированный массив: " + java.util.Arrays.toString(arr));
    System.out.println(arr[2]);
}
}
