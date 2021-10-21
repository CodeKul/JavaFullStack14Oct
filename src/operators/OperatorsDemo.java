package operators;

/**
 * unary => a++,a--,++a,--a
 * relational => < , > == , !=
 * arithmetic => + , - , /,*,%
 * logical   => && ||
 * bitwise => & , |
 * shift => << , >>
 * assignment => =  <=, >=
 * ternary operator => ? :
 */

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);//a = a+1 = 10
        System.out.println(a);//11
        System.out.println(a--);//a = a-1 =11
        System.out.println(a);//10
        System.out.println(--a);//a-1 = a
        System.out.println(++a);//a+1 = a
        int b = 3;
        System.out.println(a!=b);//true

        System.out.println(a/b);//3
        System.out.println(a%b);//1


        System.out.println(a>b && b>a);
        System.out.println(a>b || b>a);

        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a<<2);//a = a*2^2= 10*4 = 40
        System.out.println(a>>2);//a = a/2^2= 10/4
//        if(a>b){
//            System.out.println("a is greater");
//        }else {
//            System.out.println("b is  greater");
//        }

        String str = a>b?"a is greater":"b is  greater";
        System.out.println(str);

    }
}
