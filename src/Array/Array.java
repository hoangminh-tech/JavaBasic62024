package Array;

import VongLapFor.For;

public class Array {
    public static void main(String[] args) {
        //khai báo mảng rỗng
        int number1 [] = new int[6];

        //gán giá trị cho mảng
        number1 [0] = 40;
        number1 [1] = 30;
        number1 [2] = 02;
        number1 [3] = 43;
        number1 [4] = 11;
        number1 [5] = 33;

        System.out.println("Độ dài mảng: "  + number1.length);

        for (int i =0; i<number1.length;i++){
            System.out.println(number1[i]);
        }

        System.out.println( "======================");
        for (int number:number1){
            System.out.println(number);
        }
    }
}
