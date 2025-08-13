package SinhVien;

public class SinhVien {
    private int maNv;
    private String hoTen;
    private double diem;
    private int age;


    public SinhVien() {
    }

    public SinhVien(int maNv, String hoTen, double diem, int age) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.diem = diem;
        this.age = age;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maNv='" + maNv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                ", age=" + age +
                '}';
    }
}
