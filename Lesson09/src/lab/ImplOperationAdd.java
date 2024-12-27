package lab;

public class ImplOperationAdd implements IAccuracy,ITinhToan{
    private int accuracy;
    @Override
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    @Override
    public void doOperation(float num1, float num2) {
        System.out.printf("\n Result Add = %." + this.accuracy + "f\n", num1 + num2);
    }

    // test
    public static void main(String[] args) {
        ImplOperationAdd obj = new ImplOperationAdd();
        obj.setAccuracy(4);
        obj.doOperation(1,2);

    }
}
