/**
 * @author Miguel Goulao, n. xxxxx
 * Demo for the Git lab on Software Engineering
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Let's hear it from the pets");
        IAnimal dog = new Dog("Bobby");
        IAnimal cat = new Cat("Kitty");
        System.out.println(dog.getName() + " says " + dog.speak());
        System.out.println(cat.getName() + " says " + cat.speak());
    }
}