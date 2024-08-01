public class Valuable {
    String province = "cantho";
    static int number = 1234;
    static String Chuoi = "Hoang Minh";

    public void sayhello() {
        int n = 10; //biến cục bộ
        System.out.println("Giá trị của n là: " + n);
        //System.out.println(province);
        System.out.println(Chuoi);
    }

    public void getinfo() {
        //System.out.println(n);
    }

    public static void main(String[] args) {
        // cách gọi thành phần trong 1 class vào hàm bất kỳ
        Valuable bien = new Valuable();

        System.out.println(number);
        System.out.println(bien.province);
        System.out.println(Chuoi);
    }
}
