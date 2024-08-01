package Homework;

public class SinhVien {
    //Bien toàn cục instance
    public String Name = "Hoang Minh";
    //Bien Static
    public static int age = 35;


    public void Class (){
        // Biến cục bộ
        String Lop = "Lớp 12";
        System.out.println(Lop);
    }
    public static void main(String[] args) {
        System.out.println(age);

        SinhVien SV = new SinhVien();
        System.out.println(SV.Name);
        SV.Class();

        ThongTin.TenTruong();
    }
}
