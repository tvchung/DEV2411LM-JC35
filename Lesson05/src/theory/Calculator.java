package theory;

public class Calculator {
    // Method
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
//    public void add(int a, int b, int c) {
//        System.out.println("");;
//    }
    public int add(int a, int b, float c) {
        return  a+b+ (int)c;
    }
    public  float add(float a, float b) {
        return a+b;
    }
    public void subtract(int a, int b) {
        int res = a-b;
        System.out.printf("\n %d - %d = %d\n", a,b,res );
    }
    public void multiply(int a, int b) {
        int res = a * b;
        System.out.printf("\n %d * %d = %d\n", a,b,res );
    }

    public float divide(int a, int b) {
        if(b!=0)
            return (float)a/b;
        return 0;
    }

    // PassByValue
    public void PassByValue(int a) {
         a = a+10;
        System.out.println("In Method:"+a);
    }

    // PassByReference
    public void calcArea(Circle objPi, double rad){
        // Use getPI() method to retrieve the value of PI
        double area= objPi.getPI() * rad * rad;
        // Print the value of area of circle
        System.out.println("Area of the circle is "+ area);

        Circle  circle = new Circle();
//        System.out.println("PI:"+circle.PI);
        System.out.println("PI:"+circle.getPI());

    }

    // Phương thức không giới hạn tham số:
    public void  addNumber (int ...num){
        int total=0;
        for (int n:num){
            total +=n;
        }
        System.out.println("Total number is "+ total);
    }
    //test
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(1,2);
        System.out.println("Tồng:"+result);
        calc.subtract(2,3);
        calc.multiply(2,3);
        float result_1 = calc.divide(2,3);
        System.out.println("Chia:"+result_1);

        // PassByValue
        int a = 100;
        calc.PassByValue(a);
        System.out.println("Out:"+a);

        // PassByRef
        calc.calcArea(new Circle(),2);

        //
        calc.addNumber(10,20,30);
        calc.addNumber(1,2,3,2,4,2);
    }
}

class  Circle{
    private float PI = 3.14f;
    public float getPI(){
        return PI;
    }
}