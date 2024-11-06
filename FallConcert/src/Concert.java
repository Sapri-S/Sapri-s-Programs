public class Concert {
    private String venue;
    private double cost;
    private Musician Musician;
    private Instrument Instrument;


    public Concert(){
       setVenue("");
       setCost(0.0);
       setMusician(null);
       setInstrument(null);
    }

    public Concert(String venue, double cost, Musician Musician, Instrument Instrument){
        this.setVenue(venue);
        this.setCost(cost);
        this.setMusician(Musician);
        this.setInstrument(Instrument);
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Musician getMusician() {
        return Musician;
    }

    public void setMusician(Musician musician) {
        Musician = musician;
    }

    public Instrument getInstrument() {
        return Instrument;
    }

    public void setInstrument(Instrument instrument) {
        Instrument = instrument;
    }

    @Override
    public String toString() {
        return venue + '*' + cost + System.getProperty("line.separator") + Musician + System.getProperty("line.separator") + Instrument;
    }
}
