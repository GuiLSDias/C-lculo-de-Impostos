public class Product implements Taxable{
    protected double productValue;
    protected double freight;
    protected double insurance;
    private Ipi ipi;
    private Icms icms;

    public Product(double productValue, double freight, double insurance, double icmsRate) {
        this.productValue = productValue;
        this.freight = freight;
        this.insurance = insurance;
        this.ipi = new Ipi(productValue + freight + insurance);
        this.icms = new Icms(productValue, icmsRate);
    }

    @Override
    public double calculateTax() {
        return ipi.calculate() + icms.calculate();
    }

    public double getFinalPrice(double profitMargin) {
        double taxes = calculateTax();
        return productValue + taxes + (productValue * (profitMargin / 100));
    }
}
