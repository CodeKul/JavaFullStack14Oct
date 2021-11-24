package test22Nov;

public class Student {
    int rollNumber;
    String name;
    long contactNumber;
    double totalMark;

    public Student(int rollNumber, String name, long contactNumber, double totalMark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.contactNumber = contactNumber;
        this.totalMark = totalMark;
    }

    public void display(){
        System.out.println("RollNo:"+rollNumber+" name:"+name+" contactNumber:"+contactNumber+" totalMark:"+totalMark);
    }
}
