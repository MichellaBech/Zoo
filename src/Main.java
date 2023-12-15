package src;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Animal> mammals = new ArrayList<>();
        ArrayList<Animal> lions = new ArrayList<>();

        Lion lion = new Lion(true);
        Parrot parrot = new Parrot(false);

        animals.add(lion);
        animals.add(parrot);

        for (Animal animal : animals)
        {
            animal.makeSound();
        }

        for (Animal animal : animals)
        {
            if (animal.isMammal()) {
                mammals.add(animal);
            }

        }
        System.out.println(mammals);

        for (Animal animal : animals)
        {
            if (animal instanceof Lion) {
                lions.add(animal);
            }
        }

        System.out.println(lions);

    }
}
