package HomeworkWeek2;

public class Main {
    public static void main(String[] args){
        Premiu oscar1990 = new Premiu ("oscar", 1990);
        Premiu oscar2000= new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu ("oscar", 2010);
        Premiu oscar2020= new Premiu ("oscar", 2020);

        Actor actorOscar1990 = new Actor ("actor cu 1 oscar", 25, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2000 = new Actor ("actor cu oscar din 2000", 30,new Premiu[]{oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 40,new Premiu []{oscar2010});
        Actor actorFaraPremii01= new Actor ("actor fara premii 01", 20, new Premiu[]{});
        System.out.println(actorFaraPremii01);

        Film film1= new Film (1990,"film cu actori de oscar",  new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2= new Film(2000, "film cu actori fara premiu 02", new Actor[]{actorFaraPremii01});
        Studio studio1 = new Studio("MGM",new Film[]{film1,film2});
        Studio studio2 = new Studio("Disanay",new Film[]{});
        Studio[] studioDatabase = new Studio[]{studio1, studio2};


    }
}
