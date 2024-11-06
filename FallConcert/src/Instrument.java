public class Instrument {
    private String instrumentName;
    private String manufacturer;
    private double weight;


    public Instrument(){
        setInstrumentName("");
        setManufacturer("");
        setWeight(0);
    }

    public Instrument(String instrumentName, String manufacturer, double weight){
        this.setInstrumentName(instrumentName);
        this.setManufacturer(manufacturer);
        this.setWeight(weight);
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.instrumentName + "\n" + this.manufacturer + "\n" + this.weight + "\n";
    }
}
