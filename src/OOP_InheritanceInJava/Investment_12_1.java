package OOP_InheritanceInJava;

public class Investment_12_1 {
    public String investmentId;
    public String investmentName;
    public double initialInvestment;
    public double currentValue;
    public boolean isProfitable;

    // Default constructor
    public Investment_12_1() {
    }
    // Constructor with parameters
public Investment_12_1(String investmentId, String investmentName, double initialInvestment, double currentValue, boolean isProfitable) {
    this.investmentId = investmentId;
    this.investmentName = investmentName;
    this.initialInvestment = initialInvestment;
    this.currentValue = currentValue;
    this.isProfitable = isProfitable;
    }
}

