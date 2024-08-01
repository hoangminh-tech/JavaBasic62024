package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class collection {

    public static void main(String[] args) {
        Set <String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashbroad");
        menu.add("Customer");
        menu.add("Project");

        System.out.println("Các phần tử của set");
        System.out.println(menu);

        //Duyệt giá trị trong set

        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next() + ",");

        }
        System.out.println("\n" + "======");

        for (String Obj : menu){
            System.out.println(Obj);
        }

    }
}
