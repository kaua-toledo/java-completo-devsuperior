package tax_payers.entities;

public abstract class TaxPayer {

    private String name;
    private Double annualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double tax();
}
