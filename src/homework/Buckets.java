package src.homework;


public class Buckets {
    public static void main(String[] args) {
        int bucket_1 = 30;
        int bucket_2 = 0;

        for (int i = 1; i <= 30; i++){
            bucket_1--;
            
            if (i % 10 != 0){
                bucket_2++;
            }
            System.out.println(bucket_1);
            System.out.println(bucket_2);
        }
    }
}   
