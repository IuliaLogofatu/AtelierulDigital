package AnimalHierarchy;

    class Cat extends Animal implements Pet {
    protected String name;


    public Cat(int legs, String name) {
        super(4);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println("The cat eats");
    }
    public void play(){
        System.out.println("The cat plays");
    }

}
