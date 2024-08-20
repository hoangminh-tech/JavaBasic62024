package Array;

public class Array2
{
    public static void main(String[] args) {
        //khai báo và gan gia tri cho mảng
        int number2[]={5,10,15,20,0};
        boolean check = true;
        number2[4]=100;
        System.out.println("kích cỡ mảng: " +number2.length);
        for (int i =0; i<number2.length;i++){
            System.out.println(number2[i]);
        }

        //Ví dụ 2: AUTOMATION
        String Customer [] = {"Hoa", "Lan", "Huệ", "Cúc", "Thủy"};
        System.out.println(Customer[0]);//Test lần 1
        System.out.println(Customer[1]);//Test lần 2
        System.out.println(Customer[2]);//Test lần 3
        System.out.println(Customer[3]);//Test lần 4
        System.out.println("====================================");

        // Dùng For kiểm tra theo tên
        for (int i =0; i<Customer.length; i++){
            if(Customer[i].equals("Huệ"))
            {
                check = true;
                break;
            }else
            {
                check = false;
            }
        }

        if(check == true){
            System.out.println("Đã tìm thấy");
        }else {
            System.out.println("Không tìm thấy");
        }

//        int CustomerAge [] = {"21", "22", "32", "23", "34"};
//        System.out.println(CustomerAge[0]);//Test lần 1
//        System.out.println(CustomerAge[1]);//Test lần 2
//        System.out.println(CustomerAge[2]);//Test lần 3
//        System.out.println(CustomerAge[3]);//Test lần 4

    }
}
