package ToanTu;

public class ToanTu1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 5;

        //toán tử số học
        System.out.println(a++);
        System.out.println(a);//a = 11
        System.out.println(a += 5); //a = 16

        //toán tử so sánh
        System.out.println("So sánh a>b: " + (a>b));
        System.out.println((a>b) && (b>c));
        System.out.println((a>b) || (b>c) || (a>c) || (b<a));
    }
}
