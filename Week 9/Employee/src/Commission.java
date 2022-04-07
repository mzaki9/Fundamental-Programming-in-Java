public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double ecommmisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = ecommmisionRate;
    }

    public void addSales(double etotalSales){
        totalSales += etotalSales;
    }

    public double pay(){
        double Commission = totalSales * commissionRate;
        double payment = super.pay() + Commission;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}
