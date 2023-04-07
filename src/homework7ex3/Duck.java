package homework7ex3;

public class Duck implements Animal{
    public Duck() {
    }

    @Override
    public String walk() {
        return "duck-walk";
    }

    @Override
    public String talk() {
        return "duck-talk";
    }

    @Override
    public String eat() {
        return "duck-eat";
    }
}
