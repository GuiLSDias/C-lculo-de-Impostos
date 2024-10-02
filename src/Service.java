public class Service implements Taxable{

    private double serviceValue;
    private Iss iss;

    public Service(double serviceValue, double issRate) {
        this.serviceValue = serviceValue;
        this.iss = new Iss(serviceValue, issRate);
    }

    @Override
    public double calculateTax() {
        return iss.calculate();
    }

    public double getFinalPrice() {
        return serviceValue + calculateTax();
    }
}
