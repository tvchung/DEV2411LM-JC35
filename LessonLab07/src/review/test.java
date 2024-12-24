package review;

import java.util.ArrayList;
import java.util.Collections;

public class test {

    public static void main(String[] args) {
        System.out.println("Teesst");
        Student[] students = new Student[10];

        // thêm
        students[0] = new Student(1,"Sinh viên 1",20);
        students[1] = new Student(2,"Sinh viên 2",21);
        students[2] = new Student(3,"Sinh viên 3",23);
        students[3] = new Student(4,"Sinh viên 4",22);
        students[4] = new Student(5,"Sinh viên 5",25);

        students[9] = new Student(10,"Sinh viên 10",20);


        // output
        for (Student student : students) {
            if(student !=null)
                System.out.println(student.toString());
        }


        System.out.println("Arraylist");
        // ArrayList
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"Sinh viên 1",20));
        list.add(new Student(2,"Sinh viên 2",21));
        list.add(new Student(3,"Sinh viên 3",25));
        list.add(new Student(4,"Sinh viên 4",23));
        list.add(new Student(5,"Sinh viên 5",22));

        for (Student student : list) {
            System.out.println(student.toString());
        }

        Collections.sort(list,(a,b)->{return b.age-a.age;});
        System.out.println("Arraylist: ");
        for (Student student : list) {
            System.out.println(student.toString());
        }


    }
}
