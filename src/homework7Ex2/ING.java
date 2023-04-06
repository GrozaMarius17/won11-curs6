package homework7Ex2;

public class ING implements BankAccount {
    private double totalSum;
    public ING(double totalSum) {
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
        if(sumToWithdraw > totalSum){
            return -1;
        }
        totalSum = totalSum - sumToWithdraw;
        return sumToWithdraw;
    }
}
