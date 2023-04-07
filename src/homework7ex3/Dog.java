package homework7ex3;

public class Dog implements Animal  {
    public Dog(){
    }
    @Override
    public String walk(){
        return "dog-walk";
    }

    @Override
    public String talk() {
        return "dog-ham-ham";
    }

    @Override
    public String eat() {
        return "dog-eat";
    }

}
