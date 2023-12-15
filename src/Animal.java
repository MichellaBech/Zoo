package src;

public abstract class Animal {

    private boolean isMammal;

    public Animal(boolean isMammal)
    {
        this.isMammal = isMammal;
    }

    public abstract void makeSound();

    public boolean isMammal() {
        return isMammal;
    }





}
