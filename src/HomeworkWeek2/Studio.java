package HomeworkWeek2;

public class Studio {
    protected String nume;
    protected Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }


    public String toString(){
        return " \n Nume studio: "+ this.nume + " \n Filme: "+ this.filme;
    }
}
