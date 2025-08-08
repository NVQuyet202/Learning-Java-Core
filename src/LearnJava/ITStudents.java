package LearnJava;

public class ITStudents extends Student{
    private String language;

    public ITStudents(String id, String name, double tax, double price, String language) {
        super(id, name, tax, price);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void studentInfo () {
        super.infoStudent();
        System.out.println("Language: " + this.language);
    }

    @Override
    void tinhDiem() {

    }
}
