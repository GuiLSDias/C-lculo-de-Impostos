public class Iss extends Tax{
    private double rate;

    public Iss(double baseValue, double rate) {
        super(baseValue);
        this.rate = rate;
    }

    @Override
    public double calculate(){
        return baseValue * (rate / 100);
    }
}
