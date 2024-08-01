package Homework;

public class VongLapFor {

    public static void main(String[] args) {
        //Tạo mảng để lưu các số chẵn
        int[] a = new int[26];
        int b = 0;

        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
            if (i % 2 == 0) {
                a[b] = i;
                b++;
            }
        }

        System.out.println("các số chẵn từ 0 đến 50 là: ");
        for (int number : a) {
            System.out.print(number + " ");
        }
    }
}
