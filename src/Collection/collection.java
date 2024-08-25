package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class collection {
    //Set: không được lưu giá trị trùng lặp
    //List: được phép lưu giá trị trùng lặp
    //map: dạng key value, không thử lưu giá trị trùng , nếu trùng thì lưu dữ liệu sau cùng. mỗi key chỉ ánh xạ 1 giá trị
    public static void main(String[] args) {
        //khai báo kiểu dữ liệu  và không lưu trùng lặp dữ liệu
        Set <String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashbroad");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Task");

//        System.out.println("Các phần tử của set");
//        System.out.println(menu);

        //Duyệt giá trị trong set bằng iterator
        System.out.println(menu.contains("Task"));
        System.out.println(menu.remove("Customer"));
        System.out.println(menu.size());

        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next() + ",");

        }
        System.out.println("\n" + "======");

        // Duyệt giá trị trong set bằng for each
        for (String Obj : menu){
            System.out.println(Obj);
        }

    }
}
