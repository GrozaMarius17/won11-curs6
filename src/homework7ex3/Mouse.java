package homework7ex3;

public class Mouse implements Animal {
    public Mouse() {
    }

    @Override
    public String walk(){
        return "mouse-walk";
    }

    @Override
    public String talk() {
        return "mouse-chit-chit";
    }

    @Override
    public String eat() {
        return "mouse-eat";
    }
}
