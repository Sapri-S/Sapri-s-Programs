public class Musician {
    private String name;
    private String specialty;
    private int ranking;

    public Musician() {
        this.setName("Gwendoline");
        this.setSpecialty("keyboard");
        this.setRanking(200);
    }
    public Musician(String name, String specialty, int ranking) {
        this.setName(name);
        this.setSpecialty(specialty);
        this.setRanking(ranking);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.specialty + ", " + this.ranking;
    }
}
