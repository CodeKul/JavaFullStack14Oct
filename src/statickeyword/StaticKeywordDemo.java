package statickeyword;

public class StaticKeywordDemo {
    static String companyName = "ABC";
    int empId;
    String empName;

    Integer i=90;
    public StaticKeywordDemo(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        System.out.println("Id=>" + empId + " name=>" + empName + " companyName=>" + companyName);
    }

    public static void main(String[] args) {
        StaticKeywordDemo obj1 = new StaticKeywordDemo(1, "Akash");
        StaticKeywordDemo obj2 = new StaticKeywordDemo(2, "Suhas");
        StaticKeywordDemo obj3 = new StaticKeywordDemo(3, "Ravi");

        StaticKeywordDemo.show();
    }

    public static void show() {
        System.out.println("In show method");
    }
}
