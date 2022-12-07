package kingdom;

public class Main {
    public static void main(String[] args) {


        Animals animalDog = new Animals();
        Animals animalBird = new Animals();
        Animals animalFish = new Animals();

        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        Chicken chicken = new Chicken();
        Parrot parrot = new Parrot();
        Dolphin dolphin = new Dolphin();

        //Dog
        animalDog.setType("Dog");
        animalDog.setNumberOfFeet(4);
        System.out.println("Type: " + animalDog.getType());
        System.out.println("Owner: " + dog.getOwner());
        System.out.println("Number of Feet: " + animalDog.getNumberOfFeet());
        System.out.println("A " + animalDog.getType() + " can " + animalDog.eat());
        System.out.println("A " + animalDog.getType() + " can " + animalDog.move());
        System.out.println("A " + animalDog.getType() + " can " + dog.walk());
        System.out.println("A " + animalDog.getType() + " can " + animalDog.sound());

        //Bird
        animalBird.setType("Bird");
        animalBird.setNumberOfFeet(2);
        System.out.println("Type: " + animalBird.getType());
        System.out.println("Number of Feet: " + animalBird.getNumberOfFeet());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.eat());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.move());
        System.out.println("A " + animalBird.getType() + " can " + bird.layeggs());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.sound());

        //Fish
        animalFish.setType("Fish");
        animalFish.setNumberOfFeet(0);
        System.out.println("Type: " + animalFish.getType());
        System.out.println("Number of Feet: " + animalFish.getNumberOfFeet());
        System.out.println("A " + animalFish.getType() + " can " + animalFish.eat());
        System.out.println("A " + animalFish.getType() + " can " + animalFish.move());
        System.out.println("A " + animalFish.getType() + " can " + fish.swim());
        System.out.println("A " + animalFish.getType() + " can " + fish.layeggs());
        System.out.println("A " + animalFish.getType() + " can " + animalFish.sound());

        //Chicken
        animalBird.setType("Chicken");
        animalBird.setNumberOfFeet(2);
        System.out.println("Type: " + animalBird.getType());
        System.out.println("Number of Feet: " + animalBird.getNumberOfFeet());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.move());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.eat());
        System.out.println("A " + animalBird.getType() + " can " + chicken.layeggs());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.sound());

        //Parrot
        animalBird.setType("Parrot");
        animalBird.setNumberOfFeet(2);
        System.out.println("Type: " + animalBird.getType());
        System.out.println("Number of Feet: " + animalBird.getNumberOfFeet());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.move());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.eat());
        System.out.println("A " + animalBird.getType() + " can " + parrot.layeggs());
        System.out.println("A " + animalBird.getType() + " can " + animalBird.sound());
        parrot.fly();
        parrot.sing();

        //Dolphin
        animalFish.setType("Dolphin");
        animalFish.setNumberOfFeet(0);
        System.out.println("Type: " + animalFish.getType());
        System.out.println("Number of Feet: " + animalFish.move());
        System.out.println("A " + animalFish.getType() + " can " + animalFish.move());
        System.out.println("A " + animalFish.getType() + " can " + animalFish.eat());
        System.out.println("A " + animalFish.getType() + " can " + fish.swim());
        System.out.println("A " + animalFish.getType() + " can " + fish.layeggs());
        dolphin.jump();
        dolphin.dance();
    }
}