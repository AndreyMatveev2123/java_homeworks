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

        Animal horse = new Animal();
        horse.name = "Лошадь";
        horse.sound = "го-го";
        horse.makeSound();

        Animal frog = new Animal();
        frog.name = "Лягушка";
        frog.sound = "ква-ква";
        frog.makeSound();

        Animal fox = new Animal();
        fox.name = "Лиса";
        fox.sound = "пам-пам";
        fox.makeSound();
    }

    void makeSound(){
        System.out.println(name + " говорит " + sound);
    }
}
