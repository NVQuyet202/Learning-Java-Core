package LearnJava;

public class CoKhiStudents  extends  Student {
    private String skill;

    public CoKhiStudents(String id, String name, double tax, double price, String skill) {
        super(id, name, tax, price);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    @Override
    public void tinhDiem() {}

}
