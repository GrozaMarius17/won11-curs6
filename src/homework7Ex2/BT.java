package homework7Ex2;

public class BT implements BankAccount {
    private double totalSum;
    public BT(double totalSum) {
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
    public double withdraw(double sumToWithdraw) {
        if (totalSum < sumToWithdraw) {
            return -1;
        }
        totalSum = totalSum - sumToWithdraw;
        return sumToWithdraw;
    }
}
