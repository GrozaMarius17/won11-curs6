package homework7Ex2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new ING(0);
        bankAccount.deposit(20);
        System.out.println(bankAccount.getTotalSum());

        double withdrawnSum = bankAccount.withdraw(5);
        System.out.println(withdrawnSum);
        System.out.println(bankAccount.getTotalSum());

//        Marius marius = new Marius();
//        marius.setBankAccount(new ING());
//        double deposit = 20;
//        System.out.println("The amount you want to deposit" + deposit);
    }
}
