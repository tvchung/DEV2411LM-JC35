package theory;

public class TestNestedClass {
    public static void main(String[] args) {
        ClassA a = new ClassA("Devmaster",6);
        a.show();

        ClassA.ClassAB ab = a.new ClassAB("AB");
        ab.show();


    }
}
