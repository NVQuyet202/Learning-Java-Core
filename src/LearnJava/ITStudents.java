package LearnJava;

public class ITStudents extends Student{
    private String language;
    private double scoreJava;
    private double scoreHTML;


    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public ITStudents(String id, String name, double tax, double price, String language, double scoreHTML, double scoreJava) {
        super(id, name, tax, price);
        this.language = language;
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public double getDiem() {
        return (this.scoreJava * 2 + this.scoreHTML)/3;
    }

    public void studentInfo () {
        super.studentInfo();
        System.out.println("Language: " + this.language);
        System.out.println("scoreHtml: " + this.scoreHTML);
        System.out.println("scoreJava: " + this.scoreJava);
        System.out.println("score: " + this.getDiem());
    }


}
