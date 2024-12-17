package theory;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        System.out.println(arrayList.size());

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add("Chung Chung");

        System.out.println(arrayList.size());

        printArrayList(arrayList);

        arrayList.stream().forEach(System.out::println);
    }

    static  void  printArrayList(ArrayList arrayList) {
        System.out.println("Danh sách");
        for (var item:arrayList) {
            System.out.println(item);
        }
    }
}
