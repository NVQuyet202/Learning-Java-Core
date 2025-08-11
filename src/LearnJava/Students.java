package LearnJava;

public class Students extends Person{
    private float mark;
    private String grade;

    public Students(String id, String name, int age, float mark) {
        super(id, name, age);
        this.mark = mark;
    }

    public Students(float mark, String grade) {
        this.mark = mark;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void setGrade() {
        if (this.mark >= 8) {
            this.grade = "A";
        } else if (this.mark >= 7 ) {
            this.grade = "B";
        }
        else if (this.mark >= 6 ) {
            this.grade = "C";
        }
        else if (this.mark >= 5  ) {
            this.grade = "D";
        }
        else {
            this.grade = "Tạch";
        }
    }

    public String toString() {
        return "Students{" +
                "mark=" + mark +
                ", grade='" + grade + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
