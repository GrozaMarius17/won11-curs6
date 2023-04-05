package Interfaces;

public class Company {
    private FoodProvider foodsource;
    private int numberOfEmployees = 10;

    public void setFoodsource(FoodProvider foodsource) {
        this.foodsource = foodsource;
    }

    public void sendFoodToEmployees() {
        for(int i=0;i<numberOfEmployees;i++) {
            System.out.println(foodsource.deliverFood());
        }
    }
    public void makePayment() {
        foodsource.pay(100);
    }
}
