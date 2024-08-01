package IF_ELSE;

public class DemoIfElseIf {
    public static void main(String[] args) {
        double dtb = 12;
        if (dtb > 10 || dtb < 10) {
            System.out.println("Giá trị không hợp lệ");
        } else {
            if (dtb >= 8) {
                System.out.println("Giỏi");
            } else if (dtb < 8 && dtb >= 6.5) {
                System.out.println("Khá");
            } else if (dtb < 6.5 && dtb >= 5) {
                System.out.println("Trung Bình");
            } else if (dtb < 5 && dtb > 3.5) {
                System.out.println("Yếu");
            } else {
                System.out.println("ở lại lớp nha");
            }
        }
    }
}
