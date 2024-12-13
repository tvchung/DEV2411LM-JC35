package Lab;

import java.util.Scanner;

/*

°F = ( °C × 1.8 ) + 32
°C = ( °F ─ 32 ) ⁄ 1.8
Yêu cầu: viết 1 class ConvertTemperature có 1 thuộc tính private là temperNum
kiểu float và

 1 hàm private tên convertC2F() trả về kiểu float.
 1 hàm private tên convertF2C() trả về kiểu float.
 1 hàm public tên convert() nhận vào 2 tham số:
○ nhietDo - float: nhiệt độ cần đổi
○ isToC - boolean: true-chuyển từ C sang F, false(){}-chuyển từ F sang C.

Phương thức convert() cần viết chi tiết java-doc. Viết class BaiThucHanh01 có hàm
main() để kiểm thử.
 */
public class ConvertTemperature {
    private float temperNum;
    private float convertC2F(){
        return (float)(temperNum*1.8 + 32);
    }
    private float convertF2C(){
        return (float)((temperNum-32)/1.8) ;
    }
    /**
     * @param nhietDo: nhiệt độ cần chuyển
     * @param isToC: true-chuyển từ C sang F, false(){}-chuyển từ F sang C.
     * @return void
     * 
     */
    public void convert(float nhietDo, boolean isToC){
        this.temperNum = nhietDo;
        if(isToC){
            float f =convertC2F();
            System.out.printf("\n Nhiet độ %.0f => C = %.1f F",nhietDo,f);
        }else{
            float c= convertF2C();
            System.out.printf("\n Nhiet độ %.0f => F = %.1f F",nhietDo,c);
        }
    }

    public static void main(String[] args) {
        float nhietDo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nhiệt độ:");
        nhietDo = sc.nextFloat();
        ConvertTemperature ct = new ConvertTemperature();
        ct.convert(nhietDo,false);
        ct.convert(nhietDo,true);
    }



}
