public abstract class Tax {
    protected double baseValue;

    public Tax(double baseValue){
        this.baseValue = baseValue;
    }

    public abstract double calculate();
}
