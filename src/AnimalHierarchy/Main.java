package AnimalHierarchy;

public class Main {

    public static void main(String [] args) {
        Fish d = new Fish(0, "Ion");
        Cat c = new Cat(4, "Fluffy");
        Animal a = new Fish(0, "Mih");
        Animal e = new Spider(8);
        Pet p = new Cat(4, "bla");
        d.play();
        d.eat();
        e.eat();

    }

}
