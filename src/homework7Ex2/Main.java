package homework7Ex2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BT(0);
        bankAccount.deposit(20);
        System.out.println("Current sum is: " + bankAccount.getTotalSum());

        double withdrawnSum = bankAccount.withdraw(5);
        System.out.println("Withdraw sum is: " + withdrawnSum);
        System.out.println("Total sum collected: " + bankAccount.getTotalSum());

//        Marius marius = new Marius();
//        marius.setBankAccount(new ING());
//        double deposit = 20;
//        System.out.println("The amount you want to deposit" + deposit);
    }
}
