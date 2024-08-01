package Homework;

public class Calculator {
    public void TinhSoNguyen() {
        int a = 2;
        int b = 4;
        System.out.println("Kết quả tổng 2 số nguyen = " +(a+b));
    }

    public void TinhSothuc() {
        float c = -314;
        float d = 421;
        System.out.println("kết quả tích giữa 2 số thực = " + (c*d));
    }

    public static void main(String[] args) {
        Calculator tinh = new Calculator();

        tinh.TinhSoNguyen();
        tinh.TinhSothuc();
    }
}
