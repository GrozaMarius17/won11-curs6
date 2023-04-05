package Interfaces;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        company.setFoodsource(new McDonalds());

        company.sendFoodToEmployees();

        company.makePayment();
    }
}
