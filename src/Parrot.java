package src;

public class Parrot extends Animal{
    public Parrot(boolean isMammal) {
        super(isMammal);
    }

    @Override
    public void makeSound() {
        System.out.println("Hello, Hello");
    }

    public String toString()
    {
        return "Parrot";
    }
}
