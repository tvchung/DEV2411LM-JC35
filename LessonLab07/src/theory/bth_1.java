package theory;

public class bth_1 {
    final float PI = 3.14f;

    void  display(float pi){
        //PI=pi; => cannot assign a value to final variable PI
        System.out.println("PI = "+PI);
    }

    public static void main(String[] args) {
        bth_1 obj = new bth_1();
        obj.display(3.145f);
    }
}
