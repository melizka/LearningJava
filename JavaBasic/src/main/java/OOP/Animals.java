package OOP;

public class Animals {

    void makesound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animals {

    @Override
    void makesound() {
        System.out.println("bark-bark");
    }
}

class Cat extends Animals {
    @Override
    void makesound() {
        System.out.println("meow-meow");
    }
}

class Main {
    public static void main(String[] args){
        Animals myAnimals = new Dog();
        myAnimals.makesound();

        myAnimals = new Cat();
        myAnimals.makesound();

        // АБО  Animals[] animals = {new Dog(), new Cat()};  Масив об'єктів Animal
        //
        //        for (Animals animal : animals) {
        //            animal.makeSound();
    }
}

