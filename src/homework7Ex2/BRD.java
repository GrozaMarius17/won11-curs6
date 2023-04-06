package homework7Ex2;

public class BRD implements BankAccount{
    private double totalSum;
    public BRD(double totalSum) {
        this.totalSum = totalSum;
    }

    @Override
    public double getTotalSum() {
        return totalSum;
    }

    @Override

    public void deposit(double sumToDeposit) {
        totalSum = totalSum + sumToDeposit;
    }

    @Override
    public double withdraw(double sumToWithdraw){
        if (totalSum < sumToWithdraw) {
            return -1;
        }
        totalSum = totalSum - sumToWithdraw;
        return sumToWithdraw;
    }
}
