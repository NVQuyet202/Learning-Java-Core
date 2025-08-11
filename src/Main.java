import LearnJava.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static float Sum (int a, int b, float c) {
        int sum = a + b;
        float sum1 = a+b+c;
        return (float) sum + sum1;
    }

    public static class Person {
        private String name;
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Animal {
        public void makeSound () {
            System.out.println("Making Sound");
        }
    }

    //Override Ghi đè
    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Making Sound for Cat: Meoww");
        }
    }

    //Overloading  nạp chồng: cùng tên cùng phương thức nhưng khác số lượng kiểu tham số
    public static class MathUtil  {
        public  int add(int a, int b) {
            return a + b;
        }

        public float add(float a, float b) {
            return a + b;
        }
    }

     static abstract class Shape {
        public abstract void draw(); // Không định nghĩa
    }

    static class Circle extends Shape {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    int sumMain (int a, int b) {
        return  a + b;
    }

    public static void main(String[] args) {
        Main test  = new Main();
        System.out.println(test.sumMain(10, 20));
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        int age = 30;
        float height = 1.75f;
        double salary = 5000.5;
        char gender = 'M';
        boolean isValid = true;
        System.out.println("Kiểu dữ liệu nguyên thuỷ: " + age + ", " + height + ", " + salary + ", " + gender + ", " + isValid);

        if (age >= 18) {
            System.out.println("Trưởng thành");
        } else {
            System.out.println("Chưa đủ tuổi");
        }

            System.out.println(Sum(3,5,3.5f));

        switch (gender) {
            case 'M':
                System.out.println("Giới tính Nam");
                break;
            case 'F':
                System.out.println("Giới tính Nữ");
                break;
                default:
            return ;
        }

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // Tính đóng gói (Encapsulation)
        Person p = new Person();
        p.setName("Quyết");
        System.out.println("Tên được khởi tạo: " + p.getName());

        //Tính đa Hình (Polymorphism)
        //Overide
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.makeSound();
        cat.makeSound();

        //Overloading
        MathUtil m = new MathUtil();

        int sumInt = m.add(5,7);
        float sumFloat =m.add(3.5f,2.5f);
        System.out.println("Tổng Int:" + sumInt);
        System.out.println("Tổng Float:" + sumFloat);

        //Tính trừu tượng(Abstraction)
        Shape s = new Circle();
        s.draw();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        System.out.println(" your choice: " + choice);

        OOP oop = new OOP("Quyet",23);
        oop.setName("Quyet Nguyen");
        System.out.println("My Name is: " + oop.getName() + " and Age " +  oop.getAge());

        Product pr = new Product();
        Product pr1 = pr.nhapThongTin("compoter",200,100);
        pr.xuatThongTin(pr1);
        pr.getTaxPrice(pr1.getPrice(), pr1.getTax());
        System.out.println(        pr.getTaxPrice(pr1.getPrice(), pr1.getTax()) );
        scanner.nextLine();
        //Bai tap String
        System.out.print("Nhập user name:");
        String userName1= scanner.nextLine();
        System.out.println("Username: " + userName1);

        System.out.print("Nhập password:");
        String password= scanner.nextLine();
        System.out.println("Password: " + password);

        if(userName1.equals("nguyenvanquyet") && password.length() > 6 ){
            System.out.println("User name " + userName1 + " và password " + password + " hợp lệ!");

        }
        scanner.close();
        Student student1 = new ITStudents("1","Nguyễn Văn A",2,2000,"Java",10,9);
        student1.studentInfo();
        System.out.println("Core: " + student1.getDiem());

        // Su dung Interface
        Pig pigTest = new Pig();
        pigTest.animalSound();

        Students student2 = new Students("132","nguyenvanquyet",18,9);
        student2.setGrade();
        System.out.println(student2);


    }

}