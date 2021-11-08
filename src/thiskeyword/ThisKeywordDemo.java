package thiskeyword;

/**
 * this keyword => 1 . it refers the current  class instance variable
 * 2. it invokes the current class methods
 * 3. it invokes the current  class constructor
 */
public class ThisKeywordDemo {

    private int id;
    private String name;
    private String address;

    public ThisKeywordDemo() {
        System.out.println("In Constructor");
    }

    public ThisKeywordDemo(int i) {
        this();
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.display();
    }

    public void show(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        System.out.println("Id=>" + id + "name=>" + name + " address=>" + address);
    }

    public void display() {
        this.show(1, "akash", "nagpur");
        System.out.println("In display");
    }


}
