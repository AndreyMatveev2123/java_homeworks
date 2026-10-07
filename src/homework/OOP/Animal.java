package src.homework.OOP;

public class Animal {
    String name;
    String sound;
    public static void main(String [] args){
        Animal cat = new Animal();
        cat.name = "Кот";
        cat.sound = "мяу";
        cat.makeSound();

        Animal dog = new Animal();
        dog.name = "Собака";
        dog.sound = "гав";
        dog.makeSound();

        Animal cow = new Animal();
        cow.name = "Корова";
        cow.sound = "му";
        cow.makeSound();

    }

    void makeSound(){
        System.out.println(name + " говорит " + sound);
    }
}
