public class AnimalHierarchy {
    static class Animal {
        void makeSound() { System.out.println("Animal sound"); }
    }

    static class Dog extends Animal {
        void makeSound() { System.out.println("Dog: Woof!"); }
    }

    static class Cat extends Animal {
        void makeSound() { System.out.println("Cat: Meow!"); }
    }

    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
