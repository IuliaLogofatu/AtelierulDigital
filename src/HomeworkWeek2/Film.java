package HomeworkWeek2;

public class Film {
    protected  int anAparitie;
    protected String nume;
    protected Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public String toString(){
        return "\n Numele filmului: "+ this.nume + "\n Anul aparitiei: "+this.anAparitie +" \n Actori: "+ this.actori;

    }
}
