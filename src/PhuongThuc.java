public class PhuongThuc {

    double sum;
   public double research;


    //Hàm không trả về kq
    public void cong2so(){
        int a =5;
        int b =10;
        int c = a +b;
        sum = c;
        System.out.println(sum);
    }


    //hàm có trả về KQ
    public double nhan2so(){
        int a = 5;
        int b = 10;
        float rs = a*b;

        return rs;
    }

    public long nhan3so(int a, int b, int c){
        return a*b*c;
    }

    //Hàm có tham số
    public void cong2so(int num1, int num2)
    {
        System.out.println(num1 + num2);

    }
    public static void main(String[] args) {
        PhuongThuc PT = new PhuongThuc();
        PT.cong2so();
        PT.nhan2so();
        System.out.println(PT.nhan2so() + 5);
       PT.cong2so(10,70);

        System.out.println(PT.nhan3so(2,5,1)/5);
    }
}
