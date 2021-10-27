package abstraction.abstractdemo;

public class Football extends AbsSport{
    @Override
    public void play() {
        System.out.println("In  play football");
    }

    @Override
    public void exercise() {
        System.out.println("In football exercise");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
        obj.exercise();
    }
}

