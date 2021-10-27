package abstraction.interfacedemo;

public class Addition implements Operation{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(6,7));

    }
}
