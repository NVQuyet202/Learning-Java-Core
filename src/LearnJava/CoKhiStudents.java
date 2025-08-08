package LearnJava;

public class CoKhiStudents  extends  Student {
    private String skill;
    private double scoreCNC;
    private double scorePLC;

    public CoKhiStudents(double scoreHTML, double scorePLC, String id, String name, double tax, double price, String skill) {
        super(id, name, tax, price);
        this.skill = skill;
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    @Override
    public double getDiem() {
        return (this.scoreCNC + this.scorePLC)/2;
    }

}
