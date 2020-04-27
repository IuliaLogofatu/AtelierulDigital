package AnimalHierarchy;

class Fish extends Animal implements Pet {
    protected String name;

    public Fish(int legs, String name) {
        super(0);
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void walk(){
        System.out.println("Fishes do not walk");
    }
    public void eat(){
        System.out.println("The fish eats");
    }
    public void play(){
        System.out.println("No play");
    }
}
