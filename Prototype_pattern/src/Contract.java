public class Contract extends Employee {

    private float payForHour;
    private String contractPeriod;

    public float getPayForHour() {
        return payForHour;
    }

    public void setPayForHour(float payForHour) {
        this.payForHour = payForHour;
    }

    public String getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(String contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "payForHour=" + payForHour +
                ", contractPeriod='" + contractPeriod + '\'' +
                '}';
    }
}
