package HomeworkWeek2;

public class Premiu {
    protected String nume;
    protected int an;

    public Premiu(String nume, int an) {
        this.nume = nume;
        this.an = an;
    }

    public String toString (){
        return "\n Nume premiu: " +this.nume + " \n Anul obitinerii premiului: "+ this.an;
    }
}
