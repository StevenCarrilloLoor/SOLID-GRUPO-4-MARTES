package lsp.after;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        System.out.println("Dog actions:");
        dog.makeSound();
        if (dog instanceof Walkable) {
            ((Walkable) dog).walk();
        }

        System.out.println("\nFish actions:");
        fish.makeSound();
        if (fish instanceof Walkable) {
            ((Walkable) fish).walk();
        } else {
            System.out.println("Fish cannot walk.");
        }
    }
}