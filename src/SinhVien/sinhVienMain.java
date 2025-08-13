package SinhVien;

import java.util.Scanner;

public class sinhVienMain {

    public static int nhapMaSV() {
        int result ;
        System.out.println("Nhap ma sv");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                result = scanner.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Ma SV khong hop le. Nhap so");
                scanner.next();

            }
        }
        scanner.close();
        return result;
    }

    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)){
            int maSV = nhapMaSV();
            System.out.println("Nhap ma sv " + maSV);
            SinhVien sv = new SinhVien(maSV,"Quyet",8.8,22);
            System.out.println(sv);
        }
    }
}
