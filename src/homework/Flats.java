package src.homework;

public class Flats {
    public static void main(String[] args) {
        int diff = 12;
        int halfway = 8;
        
        int peterFlat = halfway - diff / 2;
        int kolyaFlat = peterFlat + diff;

        System.out.println(peterFlat);
        System.out.println(kolyaFlat);

    }
}
