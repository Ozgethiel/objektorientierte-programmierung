package probePrufung.generics.generics;

public class SpaceRace {
    public static void main(String[] args) {
        Dog laika = new Dog();
        Human juri = new Human();
        Rocket<Dog> sputnik2 = new Rocket<>(laika);
        Rocket<Human> wostok1 = new Rocket<>(juri);

    }

}

