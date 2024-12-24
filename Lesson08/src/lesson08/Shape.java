package lesson08;

public abstract class Shape {
    private final float PI=3.14F;

    public float getPI(){
        return PI;
    }

    // abstract method
    abstract void calculate(float val);
}
