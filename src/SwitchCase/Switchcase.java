package SwitchCase;

public class Switchcase {

    public static void main(String[] args) {
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;//thoát khỏi vòng switch
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }


        String Browser = "Chrome";
        switch (Browser) {
            case "Chrome":
                System.out.println("Chạy test với trình duyệt Chrome");
                break;
            case "edge":
                System.out.println("Chạy test với trình duyệt edge");
                break;
            case "Firefox":
                System.out.println("Chạy test với trình duyệt Firefox");
                break;
            default:
                System.out.println("Chạy mặc định với chrome");
        }
    }
}

