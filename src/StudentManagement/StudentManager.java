package StudentManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    //Thêm sinh viên
    public void addStudent( Student student ){
        students.add(student);
        System.out.println("Đã thêm sinh viên: " +  student);
    }

    public void removeStudent (int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Đã xóa sinh viên có ID: " + id);
    }

    public void displayStudents() {
        if(students.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng.");
        } else {
            // Sử dụng method reference thay vì lambda
            students.forEach(System.out::println);
        }
    }

    public void sortByGpaDescending () {
        Collections.sort(students, Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("Danh sách sau khi sắp xếp theo GPA giảm dần:");
        displayStudents();
    }
}
