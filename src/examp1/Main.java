package examp1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal1");
        Dog dog = new Dog("dog1");
        Animal cat = new Cat("cat1"); //polymorphism


        Animal animal1 = creatAnimal(true);

        System.out.println(dog.getName());
        System.out.println(cat.getName());
        cat.setName("caty");
        System.out.println(cat.getName());

        Shark shark = new Shark("shark1");
        System.out.println(shark.getName());

        printInformation(animal);
        printInformation(dog);
        printInformation(cat);
    }
    public static void printInformation(Animal animal){
        System.out.println("the name is : " + animal.getName() +" \n"+ "and the sound is : " + animal.greet());
    }

    public static Animal creatAnimal(Boolean isDog){
        if (isDog)
            return new Dog("dog");
        else
            return new Cat("cat");
    }
}
