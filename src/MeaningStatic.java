public class MeaningStatic {

    public static void main(String[] args) {
        //class member vs instance member

        Foo.gpa = 3.5;

        Foo f1 = new Foo();
        f1.age = 5;
        Foo f2 = new Foo();

    }
}

class Foo {
    int age; //instance(object) member
    String name; //instance
    static double gpa; //class member
}