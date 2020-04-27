package HomeworkWeek2;

public class Actor {
    protected String nume;
    protected int varsta;
    protected Premiu[] premiu;

    public Actor(String nume, int varsta, Premiu[] premiu) {
        this.nume = nume;
        this.varsta = varsta;
        this.premiu = premiu;
    }

    public String toString() {
        return "\n Numele actorului este: " + this.nume + "\n Varsta: " + this.varsta + "\n Premiul obtinu: " + this.premiu;
    }
    }

