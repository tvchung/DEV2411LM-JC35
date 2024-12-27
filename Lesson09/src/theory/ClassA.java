package theory;

public class ClassA {
    String name;
    int age;

    public ClassA(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public ClassA() {}

    public void show(){
        System.out.println("Class A");
    }

    // Lop con ben trong// inner class
    class ClassAB{
        String a;

        public ClassAB(String a){
            this.a = a;
        }
        public ClassAB(){}
        public void show(){
            System.out.println("Class AB");
        }

        // class con
        class ClassC{
            String c;
            public ClassC(String c){
                this.c = c;
            }
            public void show(){
                System.out.println("Class AB - C");
            }
        }
    }


}
