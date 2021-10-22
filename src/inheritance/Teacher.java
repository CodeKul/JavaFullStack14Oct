package inheritance;

public class Teacher { //parent class , super class, base class
    int id;
    String name;
    String address;
    String school = "Abc";
}

class MathsTeacher extends Teacher{ //child  class ,sub class, derived class

    public static void main(String[] args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name = "Rakesh";
        obj.address = "Mumbai";
        obj.school = "xyz";

        System.out.println("id=>" + obj.id + " name=>" + obj.name + " address=>" + obj.address+ "school=>"+obj.school);
    }
}

class ChemistryTeacher extends Teacher{


    public static void main(String[] args) {
        ChemistryTeacher obj = new ChemistryTeacher();
        obj.id = 2;
        obj.name = "Akash";
        obj.address = "Nagpur";

        System.out.println("id=>" + obj.id + " name=>" + obj.name + " address=>" + obj.address);
    }

}