public class Icms extends Tax{

    private double rate;

    public Icms(double baseValue, double rate) {
        super(baseValue);
        this.rate = rate;
    }

    @Override
    public double calculate(){
        return baseValue * (rate/100);
    }
}
