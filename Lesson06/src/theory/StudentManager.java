package theory;

import java.util.Scanner;

/**
 * Khởi tạo mảng Student (Gồm 100 phần tử);
 * Nhập số sinh viên (n)
 * Nhập n thông tin sinh viên
 * In ra màn hình n thông tin sinh viên
 * Sắp xếp danh sách sinh viên theo tuổi giảm dânf
 *
 */
public class StudentManager {
    public static void main(String[] args) {
        //1.
        Student[] students = new Student[10];
        int n;

        // Nhập n;
        System.out.println("Nhap n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // for: nhập từng sinh viên
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Nhập sinh viên thú " + i);
            System.out.print("\nID:");
            students[i].id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name:");
            students[i].name = sc.nextLine();
            System.out.print("Age:");
            students[i].age = sc.nextInt();
        }

        // In danh sách sinh viên
        System.out.println("\n Danh sacách sinh viên");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].toString());
        }
        printArray(students);
        // Sắp xếp
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (students[i].age < students[j].age) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        printArray(students);

    }

    static  void printArray(Student[] students) {
        System.out.println("\n Danh sacách sinh viên");
        for(Student student : students) {
            if(student != null)
                System.out.println(student.toString());
        }
    }

}
