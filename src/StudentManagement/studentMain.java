package StudentManagement;

import java.util.Scanner;

public class studentMain {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên theo ID");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Sắp xếp theo GPA giảm dần");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int age = sc.nextInt();
                    System.out.println("Nhập GPA: ");
                    double gpa = sc.nextDouble();
                    studentManager.addStudent(new Student(id, name, age, gpa));
                    break;
                case 2:
                    System.out.println("Nhập Id cần xóa: ");
                    int removeId =  sc.nextInt();
                    studentManager.removeStudent(removeId);
                    break;
                case 3:
                    studentManager.displayStudents();
                    break;
                case 4:
                    studentManager.sortByGpaDescending();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while( choice != 0);
        sc.close();
    }
}
