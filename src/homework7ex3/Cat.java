package homework7ex3;

public class Cat implements Animal{
    public Cat() {
    }
    @Override
    public String walk() {
        return "cat-walk";
    }
    @Override
    public String talk() {
        return "cat-miau";
    }
    @Override
    public String eat() {
        return "cat-eat";
    }
}
