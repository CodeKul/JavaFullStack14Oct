package thiskeyword;

/**
 * this keyword => 1 . it refers the instance variable
 * 2. it refers the current class methods
 */
public class ThisKeywordDemo {

    private int id;
    private String name;
    private String address;

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
