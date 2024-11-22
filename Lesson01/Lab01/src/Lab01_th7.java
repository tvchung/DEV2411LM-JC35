/*
Bài 7: Tìm max, min của 2 số được nhập vào từ bàn phím
 */
public class Lab01_th7 {
    public static void main(String[] args) {
        max(10,20);
        max(10.1f,20.1f);
    }

    static void max(int n, int m){
        int mx = (n>m)?n:m;
        System.out.printf("\n max: %d, %d là:%d", n, m, mx);
    }

    static void max(float n, float m){
        float mx = (n>m)?n:m;
        System.out.printf("\n max: %.1f, %.1f là:%.1f", n, m, mx);
    }

}
