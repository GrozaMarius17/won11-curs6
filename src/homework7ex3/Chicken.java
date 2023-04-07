package homework7ex3;

public class Chicken implements Animal{
    public Chicken(){
    }

    @Override
   public String walk(){
        return "chicken-walk";
    }

    @Override
    public String talk() {
        return "chicken-cotcodac";
    }

    @Override
    public String eat() {
        return "chicken-eat";
    }
}