package homework7ex3;

public class Main {
    public static void main(String[] args){
        Animal aCat = new Cat();
        printAnimal(aCat);

        Animal aDog = new Dog();
        printAnimal(aDog);

        Animal aMouse = new Mouse();
        printAnimal(aMouse);

        Animal aChicken = new Chicken();
        printAnimal(aChicken);

        Animal aDuck = new Duck();
        printAnimal(aDuck);
    }

    private static void printAnimal(Animal animal) {
        System.out.println(animal.walk());
        System.out.println(animal.eat());
        System.out.println(animal.talk());
    }
}
