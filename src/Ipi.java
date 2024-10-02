public class Ipi extends Tax{
    public Ipi(double baseValue){
        super(baseValue);
    }

    @Override
    public double calculate(){
        return baseValue * 0.0015;
    }
}
