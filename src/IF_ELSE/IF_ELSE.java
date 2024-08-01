package IF_ELSE;

public class IF_ELSE {

    public static void main(String[] args) {
        int age = 20;
        String address = "Can Tho";
        String Login = "Login to ERP successfully";

        //SO sánh bằng trong chuỗi thì dùng equal()
        // So sánh chứa trong chuỗi thì dùng contains()

        if ((age > 18) || address.equals("CanTho"))
        {
            System.out.println("ĐI TÙ");
        }

        if (Login.contains(" ")){
            System.out.println("Login successfully");
        }
    }
}
