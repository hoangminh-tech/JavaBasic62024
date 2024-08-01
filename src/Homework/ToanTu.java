package Homework;

public class ToanTu {

    public void Toan(){
        int a = 1;
        int b =4;
        int c = 5;
        System.out.println((a<b)&&(b>c));
        System.out.println((a<b)||(b>c));
        System.out.println((a==4));

    }

    public static int number = 100;
    public static void Toan1(int n){

        if (n == number ){
            System.out.println("n có kết quả là bằng number" );
        }else if(n<number){
            System.out.println("n có kết quả là bé hơn number" );
        }else {
            System.out.println("n có kết quả là lớn hơn number" );
        }


    }
    public static void main(String[] args) {
        ToanTu toan1 = new ToanTu();
        toan1.Toan();

        Toan1(100);
        Toan1(50);
        Toan1(150);
    }
}
